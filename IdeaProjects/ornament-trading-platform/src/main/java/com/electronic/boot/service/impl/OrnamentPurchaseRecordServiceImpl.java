package com.electronic.boot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.electronic.boot.bean.OrnamentPurchaseRecord;
import com.electronic.boot.mapper.OrnamentPurchaseRecordMapper;
import com.electronic.boot.service.OrnamentPurchaseRecordService;
import com.electronic.boot.util.BitResult;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @description 针对表【ornament_purchase_record】的数据库操作Service实现
 * @createDate 2022-11-18 23:18:25
 */
@Service
public class OrnamentPurchaseRecordServiceImpl extends ServiceImpl<OrnamentPurchaseRecordMapper, OrnamentPurchaseRecord>
        implements OrnamentPurchaseRecordService {

    @Override
    public BitResult getAllOrnamentPurchaseRecordsAsPage(String userId, Integer pageNum, Integer pageSize) {
        if (StringUtils.isBlank(userId))
            return new BitResult().fail("userId不能为空");
        LambdaQueryWrapper<OrnamentPurchaseRecord> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(userId), OrnamentPurchaseRecord::getBuyerId, userId)
                .orderByDesc(OrnamentPurchaseRecord::getId);
        Page<OrnamentPurchaseRecord> pageInfo = page(new Page<>(pageNum, pageSize), wrapper);
        return new BitResult(pageInfo).success("ok");
    }
}




