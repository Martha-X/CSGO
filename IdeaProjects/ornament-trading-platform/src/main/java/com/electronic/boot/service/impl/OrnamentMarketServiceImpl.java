package com.electronic.boot.service.impl;

import com.electronic.boot.bean.OrnamentMarket;
import com.electronic.boot.mapper.OrnamentMarketMapper;
import com.electronic.boot.service.OrnamentMarketService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class OrnamentMarketServiceImpl implements OrnamentMarketService {
    @Autowired
    private OrnamentMarketMapper ornamentMarketMapper;

    @Override
    public PageInfo<OrnamentMarket> getAllOrnamentByPage(Integer pageNum, Integer pageSize) {
        log.info("pageNum:{}",pageNum);
        log.info("pageSize:{}",pageSize);
        //开启分页
        Page<Object> ornaments = PageHelper.startPage(pageNum, pageSize);
        List<OrnamentMarket> ornamentMarkets = ornamentMarketMapper.selectByExample(null);
        PageInfo<OrnamentMarket> pageInfo = new PageInfo<>(ornamentMarkets);
        return pageInfo;
    }

    @Override
    public PageInfo<OrnamentMarket> selectOrnamentByName(String name, Integer pageNum, Integer pageSize) {
        return null;
    }
}
