package com.electronic.boot.service;

import com.electronic.boot.bean.OrnamentPurchaseRecord;
import com.github.pagehelper.PageInfo;

public interface OrnamentPurchaseRecordService {
    PageInfo<OrnamentPurchaseRecord> getAllOrnamentPurchaseRecordsByPage(String userId,Integer pageNum, Integer pageSize);
}
