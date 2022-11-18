package com.electronic.boot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.electronic.boot.bean.OrnamentSellRecord;
import com.electronic.boot.mapper.OrnamentSellRecordMapper;
import com.electronic.boot.service.OrnamentSellRecordService;
import com.electronic.boot.util.BitResult;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @description 针对表【ornament_sell_record】的数据库操作Service实现
 * @createDate 2022-11-18 23:25:22
 */
@Service
public class OrnamentSellRecordServiceImpl extends ServiceImpl<OrnamentSellRecordMapper, OrnamentSellRecord>
        implements OrnamentSellRecordService {

    @Override
    public BitResult getAllOrnamentSellRecordsAsPage(String userId, Integer pageNum, Integer pageSize) {
        if (StringUtils.isBlank(userId))
            return new BitResult().fail("userId不能为空");
        LambdaQueryWrapper<OrnamentSellRecord> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(userId), OrnamentSellRecord::getSellerId, userId)
                .orderByDesc(OrnamentSellRecord::getId);
        Page<OrnamentSellRecord> pageInfo = page(new Page<>(pageNum, pageSize), wrapper);
        return new BitResult(pageInfo).success("ok");
    }
}




