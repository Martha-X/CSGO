package com.electronic.boot.service.impl;

import com.electronic.boot.bean.OrnamentPurchaseRecord;
import com.electronic.boot.bean.OrnamentPurchaseRecordExample;
import com.electronic.boot.mapper.OrnamentPurchaseRecordMapper;
import com.electronic.boot.service.OrnamentPurchaseRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrnamentPurchaseRecordServiceImpl implements OrnamentPurchaseRecordService {
    @Autowired
    private OrnamentPurchaseRecordMapper ornamentPurchaseRecordMapper;

    @Override
    public PageInfo<OrnamentPurchaseRecord> getAllOrnamentPurchaseRecordsByPage(String userId,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        OrnamentPurchaseRecordExample example = new OrnamentPurchaseRecordExample();
        OrnamentPurchaseRecordExample.Criteria criteria = example.createCriteria();
        criteria.andBuyerIdEqualTo(userId);
        List<OrnamentPurchaseRecord> ornamentPurchaseRecords = ornamentPurchaseRecordMapper.selectByExample(example);
        PageInfo<OrnamentPurchaseRecord> pageInfo = new PageInfo<>(ornamentPurchaseRecords);
        return pageInfo;
    }
}
