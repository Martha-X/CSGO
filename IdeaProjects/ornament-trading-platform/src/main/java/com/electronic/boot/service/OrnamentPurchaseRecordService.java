package com.electronic.boot.service;

import com.electronic.boot.bean.OrnamentPurchaseRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import com.electronic.boot.util.BitResult;

/**
* @author Administrator
* @description 针对表【ornament_purchase_record】的数据库操作Service
* @createDate 2022-11-18 23:18:25
*/
public interface OrnamentPurchaseRecordService extends IService<OrnamentPurchaseRecord> {

    BitResult getAllOrnamentPurchaseRecordsAsPage(String userId, Integer pageNum, Integer pageSize);
}
