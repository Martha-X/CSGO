package com.electronic.boot.service;

import com.electronic.boot.bean.OrnamentSellRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import com.electronic.boot.util.BitResult;

/**
 * @author Administrator
 * @description 针对表【ornament_sell_record】的数据库操作Service
 * @createDate 2022-11-18 23:25:22
 */
public interface OrnamentSellRecordService extends IService<OrnamentSellRecord> {

    BitResult getAllOrnamentSellRecordsAsPage(String userId, Integer pageNum, Integer pageSize);
}
