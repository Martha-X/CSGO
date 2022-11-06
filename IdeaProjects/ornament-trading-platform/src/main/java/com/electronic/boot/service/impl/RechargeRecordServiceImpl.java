package com.electronic.boot.service.impl;

import com.electronic.boot.bean.RechargeRecord;
import com.electronic.boot.bean.RechargeRecordExample;
import com.electronic.boot.bean.User;
import com.electronic.boot.bean.UserExample;
import com.electronic.boot.mapper.RechargeRecordMapper;
import com.electronic.boot.mapper.UserMapper;
import com.electronic.boot.service.RechargeRecordService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RechargeRecordServiceImpl implements RechargeRecordService {
    @Autowired
    private RechargeRecordMapper mapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<RechargeRecord> getAllRechargeRecord(String userId,Integer pageNum,Integer pageSize) {
        Page<Object> rechargeRecords = PageHelper.startPage(pageNum, pageSize);
        RechargeRecordExample example = new RechargeRecordExample();
        RechargeRecordExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<RechargeRecord> rechargeRecordsList = mapper.selectByExample(null);
        PageInfo<RechargeRecord> rechargeRecordPageInfo = new PageInfo<>(rechargeRecordsList);
        return rechargeRecordPageInfo;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertRechargeRecord(String userId,RechargeRecord rechargeRecord) {
        mapper.insert(rechargeRecord);
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(userId);
        User user = userMapper.selectByExample(example).get(0);
        user.setBalance(user.getBalance().add(rechargeRecord.getRechargeAmount()));
        userMapper.updateByExampleSelective(user,example);
        return 1;
    }
}
