package com.hjrpc.dao;

import com.hjrpc.App;
import com.hjrpc.model.User;
import com.hjrpc.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest(classes = {App.class})
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    @Test
    public void insertSelective() {
        User user = new User();
        user.setUserName("张三");
        user.setPassword("1111");
        int i = userMapper.insertSelective(user);
        Assert.assertTrue(i>0);
    }
}