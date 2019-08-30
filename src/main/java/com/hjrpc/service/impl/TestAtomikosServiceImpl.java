package com.hjrpc.service.impl;

import com.hjrpc.dao.orders.OrderMapper;
import com.hjrpc.dao.users.UserMapper;
import com.hjrpc.model.Order;
import com.hjrpc.model.User;
import com.hjrpc.service.TestAtomikosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestAtomikosServiceImpl implements TestAtomikosService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional
    public void insertSelective() {
        User user = new User();
        user.setUserName("zhangsan");
        userMapper.insertSelective(user);
        int i = 1/0;
        Order order = new Order();
        order.setName("dfsjkjk");
        order.setUserId(231321);
        orderMapper.insertSelective(order);
    }
}
