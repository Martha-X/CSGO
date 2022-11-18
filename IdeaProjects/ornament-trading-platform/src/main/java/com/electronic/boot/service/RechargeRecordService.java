package com.electronic.boot.service;

import com.electronic.boot.bean.RechargeRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import com.electronic.boot.util.BitResult;

/**
* @author Administrator
* @description 针对表【recharge_record】的数据库操作Service
* @createDate 2022-11-18 23:28:09
*/
public interface RechargeRecordService extends IService<RechargeRecord> {

    BitResult getAllRechargeRecordAsPage(String userId, Integer pageNum, Integer pageSize);

    void insertRechargeRecord(String userId, RechargeRecord rechargeRecord);
}
