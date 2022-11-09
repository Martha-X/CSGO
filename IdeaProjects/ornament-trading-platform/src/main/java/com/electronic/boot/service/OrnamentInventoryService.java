package com.electronic.boot.service;

import com.electronic.boot.bean.OrnamentOnSale;
import com.github.pagehelper.PageInfo;

public interface OrnamentInventoryService {
    PageInfo<OrnamentOnSale> getInventoryByUserId(String userId,Integer pageNum,Integer pageSize);
}
