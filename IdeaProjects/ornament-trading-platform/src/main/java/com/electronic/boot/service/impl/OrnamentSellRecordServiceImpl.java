package com.electronic.boot.service.impl;

import com.electronic.boot.bean.OrnamentSellRecord;
import com.electronic.boot.bean.OrnamentSellRecordExample;
import com.electronic.boot.mapper.OrnamentSellRecordMapper;
import com.electronic.boot.service.OrnamentSellRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrnamentSellRecordServiceImpl implements OrnamentSellRecordService {
    @Autowired
    private OrnamentSellRecordMapper ornamentSellRecordMapper;

    @Override
    public PageInfo<OrnamentSellRecord> getAllOrnamentSellRecordsByPage(String userId,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        OrnamentSellRecordExample example = new OrnamentSellRecordExample();
        OrnamentSellRecordExample.Criteria criteria = example.createCriteria();
        criteria.andSellerIdEqualTo(userId);
        List<OrnamentSellRecord> ornamentSellRecords = ornamentSellRecordMapper.selectByExample(example);
        PageInfo<OrnamentSellRecord> pageInfo = new PageInfo<>(ornamentSellRecords);
        return pageInfo;
    }
}
