package com.electronic.boot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.electronic.boot.bean.OrnamentInventory;
import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.bean.OrnamentPurchaseRecord;
import com.electronic.boot.bean.User;
import com.electronic.boot.mapper.*;
import com.electronic.boot.service.OrnamentOnSaleService;
import com.electronic.boot.util.BitResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @description 针对表【ornament_on_sale】的数据库操作Service实现
 * @createDate 2022-11-18 22:47:46
 */
@Slf4j
@Service
public class OrnamentOnSaleServiceImpl extends ServiceImpl<OrnamentOnSaleMapper, OrnamentOnSale>
        implements OrnamentOnSaleService {

    @Autowired
    private OrnamentOnSaleMapper onSaleMapper;
    @Autowired
    private OrnamentMarketMapper marketMapper;
    @Autowired
    private OrnamentInventoryMapper inventoryMapper;
    @Autowired
    private OrnamentPurchaseRecordMapper purchaseRecordMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OrnamentSellRecordMapper sellRecordMapper;

    @Override
    public BitResult selectAllOrnamentsById(Integer goodsId, Integer pageNum, Integer pageSize, String wearZone, String conditionZone) {
        BitResult result = new BitResult();
        //开启分页
        Page<OrnamentOnSale> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<OrnamentOnSale> wrapper = new LambdaQueryWrapper<>();
        // 查出所有上架了的饰品
        wrapper.eq(OrnamentOnSale::getIsSoldOut, 0);
        if (StringUtils.isNotBlank(wearZone) && !wearZone.equals("")) {
            if (!wearZone.equals("不限")) {
                String[] paintwear = wearZone.split("-");
                wrapper.between(OrnamentOnSale::getPaintwear, paintwear[0], paintwear[1]);
            }
        }
        if (StringUtils.isNotBlank(conditionZone) && !conditionZone.equals("")) {
            if (!conditionZone.equals("默认")) {
                String sort = conditionZone.substring(conditionZone.length() - 1);
                if (conditionZone.contains("价格")) {
                    if (sort.equals("↑"))
                        wrapper.orderByAsc(OrnamentOnSale::getPrice);
                    else
                        wrapper.orderByDesc(OrnamentOnSale::getPrice);
                }
                if (conditionZone.contains("磨损度")) {
                    if (sort.equals("↑"))
                        wrapper.orderByAsc(OrnamentOnSale::getPaintwear);
                    else
                        wrapper.orderByDesc(OrnamentOnSale::getPaintwear);
                }
            }

        }
        wrapper.eq(OrnamentOnSale::getGoodsId, goodsId);
        Page<OrnamentOnSale> pageInfo = page(page, wrapper);
        result.setData(pageInfo);
        if (pageInfo.getRecords().size() > 0) {
            String name = pageInfo.getRecords().get(0).getName();
            String keyword = name.substring(name.indexOf('(') + 1, name.length() - 1);
            result.setKeyword(keyword);
        }
        result.setWearZone(wearZone);
        result.setConditionZone(conditionZone);
        return result.success("ok");
    }

    @Override
    public BitResult getEveryExteriorGoods(String name) {
        log.info("getEveryExteriorGoods---{}", name);
        List<Map<String, Object>> everyExteriorGoods = onSaleMapper.getEveryExteriorGoods(name + "%");
        for (int i = 0; i < everyExteriorGoods.size(); i++) {
            Map<String, Object> stringMap = everyExteriorGoods.get(i);
            String nameToUse = (String) stringMap.get("name");
            String substring = nameToUse.substring(nameToUse.indexOf("(") + 1, nameToUse.indexOf(")"));
            stringMap.put("name", substring);
        }
        return new BitResult(everyExteriorGoods).success("ok");
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public BitResult dealThisItemPay(String userId, BigDecimal balance, Integer itemId) {
        // 查询出对应itemId的饰品并将商品下架
        LambdaQueryWrapper<OrnamentOnSale> onSaleWrapper = new LambdaQueryWrapper<>();
        onSaleWrapper.eq(OrnamentOnSale::getId, itemId);
        OrnamentOnSale item = getOne(onSaleWrapper);
        item.setIsSoldOut(1);
        update(item, onSaleWrapper);
        // 查询当前用户下单扣金额
        User user = new User();
        user.setBalance(balance.subtract(new BigDecimal(String.valueOf(item.getPrice()))));
        LambdaQueryWrapper<User> userWrapper = new LambdaQueryWrapper<>();
        userWrapper.eq(User::getId, userId);
        userMapper.update(user, userWrapper);
        // 插入库存
        OrnamentInventory inventory = new OrnamentInventory();
        inventory.setGoodsId(item.getGoodsId());
        inventory.setUserId(userId);
        inventory.setItemId(itemId);
        inventoryMapper.insert(inventory);
        // 插入当前user的购买记录
        StringBuffer buyOrderId = new StringBuffer();
        long millis = System.currentTimeMillis();
        SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");
        Date date = new Date(millis);
        String buyOrderIdToUse = buyOrderId.append(formatter.format(date)).append('T').append(millis / 1000).toString();
        OrnamentPurchaseRecord purchaseRecord = new OrnamentPurchaseRecord();
        purchaseRecord.setId(buyOrderIdToUse);
        purchaseRecord.setIconUrl(item.getIconUrl());
        purchaseRecord.setName(item.getName());
        purchaseRecord.setPrice(item.getPrice());
        purchaseRecord.setSellerAvatar(item.getAvatar());
        purchaseRecord.setSellerNickname(item.getNickname());
        purchaseRecord.setGoodsId(item.getGoodsId());
        purchaseRecord.setBuyerId(userId);
        Date transactDate = new Date();
        purchaseRecord.setTransactDatetime(transactDate);
        purchaseRecord.setState("购买成功");
        purchaseRecord.setSellId(item.getUserId());
        purchaseRecordMapper.insert(purchaseRecord);
        return new BitResult().success(item.getPrice().toString());
    }
}




