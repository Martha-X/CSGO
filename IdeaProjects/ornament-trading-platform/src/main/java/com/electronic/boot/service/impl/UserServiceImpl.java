package com.electronic.boot.service.impl;

import com.electronic.boot.bean.User;
import com.electronic.boot.bean.UserExample;
import com.electronic.boot.mapper.UserMapper;
import com.electronic.boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUser(String username, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        return userMapper.selectByExample(userExample).get(0);
    }

    @Override
    public User register(User user) {
        String id = String.valueOf(System.currentTimeMillis()).substring(0, 10);
        String idToUse = "U" + id;
        user.setId(idToUse);
        userMapper.insertSelective(user);
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(idToUse);
        return userMapper.selectByExample(example).get(0);
    }

    @Override
    public User getUserById(String id) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        return userMapper.selectByExample(example).get(0);
    }

}
