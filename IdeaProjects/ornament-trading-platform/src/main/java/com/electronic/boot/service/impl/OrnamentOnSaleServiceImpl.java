package com.electronic.boot.service.impl;

import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.bean.OrnamentOnSaleExample;
import com.electronic.boot.mapper.OrnamentMarketMapper;
import com.electronic.boot.mapper.OrnamentOnSaleMapper;
import com.electronic.boot.service.OrnamentOnSaleService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class OrnamentOnSaleServiceImpl implements OrnamentOnSaleService {
    @Autowired
    private OrnamentOnSaleMapper onSaleMapper;
    @Autowired
    private OrnamentMarketMapper marketMapper;

    @Override
    public PageInfo<OrnamentOnSale> getAllOrnamentById(Integer id, Integer pageNum, Integer pageSize,String wearZone,String conditionZone) {
        log.info("{}", wearZone);
        log.info(conditionZone);
        //开启分页
        Page<Object> ornaments = PageHelper.startPage(pageNum, pageSize);
        OrnamentOnSaleExample example = new OrnamentOnSaleExample();
        OrnamentOnSaleExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(wearZone)&&!wearZone.equals("")) {
            if(!wearZone.equals("不限")){
                String[] paintwear = wearZone.split("-");
                log.info("{}", paintwear[0]);
                log.info("{}", paintwear[1]);
                criteria.andPaintwearBetween(paintwear[0], paintwear[1]);
            }
        }
        if (!StringUtils.isEmpty(conditionZone) && !conditionZone.equals("")) {
            if (!conditionZone.equals("默认")) {
                String sort = conditionZone.substring(conditionZone.length() - 1);
                log.info("{}", sort);
                if (conditionZone.contains("价格")) {
                    if (sort.equals("↑")) {
                        example.setOrderByClause("price asc");
                    }else{
                        example.setOrderByClause("price desc");
                    }
                }
                if (conditionZone.contains("磨损度")) {
                    if (sort.equals("↑")) {
                        example.setOrderByClause("paintwear asc");
                    }else{
                        example.setOrderByClause("paintwear desc");
                    }
                }
            }

        }
        criteria.andGoodsIdEqualTo(id);
        List<OrnamentOnSale> ornamentOnSales = onSaleMapper.selectByExample(example);
        PageInfo<OrnamentOnSale> pageInfo = new PageInfo<>(ornamentOnSales);
        return pageInfo;
    }

    @Override
    public List<Map<String, Object>> getEveryExteriorGoods(String name) {
        List<Map<String, Object>> everyExteriorGoods = onSaleMapper.getEveryExteriorGoods(name + "%");
        for (int i = 0; i < everyExteriorGoods.size(); i++) {
            Map<String,Object> stringMap = everyExteriorGoods.get(i);
            String nameToUse = (String) stringMap.get("name");
            String substring = nameToUse.substring(nameToUse.indexOf("(") + 1, nameToUse.indexOf(")"));
            stringMap.put("name", substring);
        }
        return everyExteriorGoods;
    }
}
