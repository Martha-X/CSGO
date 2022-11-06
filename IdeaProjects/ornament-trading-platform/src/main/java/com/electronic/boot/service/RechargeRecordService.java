package com.electronic.boot.service;

import com.electronic.boot.bean.RechargeRecord;
import com.github.pagehelper.PageInfo;

public interface RechargeRecordService {
    PageInfo<RechargeRecord> getAllRechargeRecord(String userId, Integer pageNum, Integer pageSize);

    int insertRechargeRecord(String userId,RechargeRecord rechargeRecord);
}
