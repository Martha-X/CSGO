package com.electronic.boot.service;

import com.electronic.boot.bean.User;

public interface UserService {

    User getUser(String username, String password);

    User register(User user);

    User getUserById(String id);
}
