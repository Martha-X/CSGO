package com.electronic.boot.service;

import com.electronic.boot.bean.OrnamentSellRecord;
import com.github.pagehelper.PageInfo;

public interface OrnamentSellRecordService {
    PageInfo<OrnamentSellRecord> getAllOrnamentSellRecordsByPage(String userId, Integer pageNum, Integer pageSize);
}
