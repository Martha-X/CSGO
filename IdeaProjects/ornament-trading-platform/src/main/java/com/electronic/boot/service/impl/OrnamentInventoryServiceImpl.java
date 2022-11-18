package com.electronic.boot.service.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.electronic.boot.bean.OrnamentInventory;
import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.mapper.OrnamentInventoryMapper;
import com.electronic.boot.service.OrnamentInventoryService;
import com.electronic.boot.util.BitResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @description 针对表【ornament_inventory】的数据库操作Service实现
 * @createDate 2022-11-18 20:23:28
 */
@Service
public class OrnamentInventoryServiceImpl extends ServiceImpl<OrnamentInventoryMapper, OrnamentInventory>
        implements OrnamentInventoryService {

    @Autowired
    private OrnamentInventoryMapper mapper;


    @Override
    public BitResult selectOrnamentInventoryAsPageByUserId(String userId, Integer pageNum, Integer pageSize) {
        Page<OrnamentOnSale> page = new Page<>(pageNum, pageSize);
        if (StringUtils.isBlank(userId)) {
            return new BitResult().fail("UserId为空");
        }
        Page<OrnamentOnSale> inventoryPage = mapper.selectOrnamentInventoryAsPageByUserId(page, userId);
        // 计算库存总价
        BigDecimal totalPrice = new BigDecimal("0");
        for (OrnamentOnSale ornamentOnSale : inventoryPage.getRecords()) {
            totalPrice = totalPrice.add(ornamentOnSale.getPrice());
        }
        BitResult result = new BitResult(inventoryPage);
        result.setBriefInfo(totalPrice.toString());
        return result.success("ok");
    }

    @Override
    public BitResult selectOrnamentSelfSellingAsPageByUserId(String userId, Integer pageNum, Integer pageSize) {
        Page<OrnamentOnSale> page = new Page<>(pageNum, pageSize);
        if (StringUtils.isBlank(userId)) {
            return new BitResult().fail("UserId为空");
        }
        Page<OrnamentOnSale> selfSellingPage = mapper.selectOrnamentSelfSellingAsPageByUserId(page, userId);
        return new BitResult(selfSellingPage).success("ok");
    }
}




