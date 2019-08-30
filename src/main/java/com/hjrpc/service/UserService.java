package com.hjrpc.service;

import com.hjrpc.model.User;

public interface UserService {
    boolean registerUser(User user);

    User login(String userName, String password);

    int insertSelective(User user);
}
