package com.electronic.boot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.electronic.boot.bean.RechargeRecord;
import com.electronic.boot.bean.User;
import com.electronic.boot.mapper.RechargeRecordMapper;
import com.electronic.boot.mapper.UserMapper;
import com.electronic.boot.service.RechargeRecordService;
import com.electronic.boot.util.BitResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 * @description 针对表【recharge_record】的数据库操作Service实现
 * @createDate 2022-11-18 23:28:09
 */
@Service
public class RechargeRecordServiceImpl extends ServiceImpl<RechargeRecordMapper, RechargeRecord>
        implements RechargeRecordService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public BitResult getAllRechargeRecordAsPage(String userId, Integer pageNum, Integer pageSize) {
        if (StringUtils.isBlank(userId)) {
            return new BitResult().fail("userId不能为空");
        }
        LambdaQueryWrapper<RechargeRecord> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(RechargeRecord::getUserId, userId);
        Page<RechargeRecord> pageInfo = page(new Page<>(pageNum, pageSize), wrapper);
        return new BitResult(pageInfo).success("ok");
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insertRechargeRecord(String userId, RechargeRecord rechargeRecord) {
        save(rechargeRecord);
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getId, userId);
        User user = userMapper.selectOne(wrapper);
        user.setBalance(user.getBalance().add(rechargeRecord.getRechargeAmount()));
        userMapper.update(user, wrapper);
    }
}




