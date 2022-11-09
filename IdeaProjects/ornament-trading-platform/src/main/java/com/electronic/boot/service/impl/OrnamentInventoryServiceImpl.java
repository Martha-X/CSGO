package com.electronic.boot.service.impl;

import com.electronic.boot.bean.OrnamentInventory;
import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.mapper.OrnamentInventoryMapper;
import com.electronic.boot.service.OrnamentInventoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrnamentInventoryServiceImpl implements OrnamentInventoryService {
    @Autowired
    private OrnamentInventoryMapper inventoryMapper;

    @Override
    public PageInfo<OrnamentOnSale> getInventoryByUserId(String userId,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        OrnamentInventory ornamentInventory = inventoryMapper.selectInventoryByUserId(userId);
        PageInfo<OrnamentOnSale> pageInfo = new PageInfo<>(ornamentInventory.getInventoryList());
        return pageInfo;
    }
}
