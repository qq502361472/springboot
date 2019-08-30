package com.hjrpc.service.impl;

import com.hjrpc.dao.users.UserMapper;
import com.hjrpc.model.User;
import com.hjrpc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean registerUser(User user) {
        int i = userMapper.insertSelective(user);
        return i>0;
    }

    @Override
    public User login(String userName, String password) {
        return userMapper.selectByParams(userName,password);
    }

    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }
}
