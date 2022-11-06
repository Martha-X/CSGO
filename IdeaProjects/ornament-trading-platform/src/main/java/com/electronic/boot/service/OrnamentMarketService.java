package com.electronic.boot.service;

import com.electronic.boot.bean.OrnamentMarket;
import com.github.pagehelper.PageInfo;

public interface OrnamentMarketService{
    PageInfo<OrnamentMarket> getAllOrnamentByPage(Integer pageNum,Integer pageSize);

    //根据标题模糊查询
    PageInfo<OrnamentMarket> selectOrnamentByName(String name, Integer pageNum, Integer pageSize);
}