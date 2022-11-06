package com.electronic.boot.service;


import com.electronic.boot.bean.OrnamentOnSale;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface OrnamentOnSaleService {
    PageInfo<OrnamentOnSale> getAllOrnamentById(Integer id,Integer pageNum, Integer pageSize,String wearZone,String conditionZone);

    List<Map<String,Object>> getEveryExteriorGoods(String name);
}
