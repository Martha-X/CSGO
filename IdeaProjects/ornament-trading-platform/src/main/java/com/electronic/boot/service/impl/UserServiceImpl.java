package com.electronic.boot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.electronic.boot.bean.User;
import com.electronic.boot.mapper.UserMapper;
import com.electronic.boot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2022-11-18 22:32:19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Override
    public User getUser(String username, String password) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(username), User::getUsername, username)
                .eq(StringUtils.isNotBlank(password), User::getPassword, password);
        return getOne(wrapper);
    }

    @Override
    public User register(User user) {
        String id = String.valueOf(System.currentTimeMillis()).substring(0, 10);
        String idToUse = "U" + id;
        user.setId(idToUse);
        save(user);
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(idToUse), User::getUsername, idToUse);
        return getOne(wrapper);
    }

    @Override
    public User getUserById(String id) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), User::getUsername, id);
        return getOne(wrapper);
    }
}




