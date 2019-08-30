package com.hjrpc.dao;

import com.hjrpc.App;
import com.hjrpc.dao.users.UserMapper;
import com.hjrpc.model.User;
import com.hjrpc.service.TestAtomikosService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {App.class})
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    @Autowired
    RedisTemplate<String,String> redisTemplate;

    @Autowired
    TestAtomikosService testAtomikosService;

    @Test
    public void insertSelective() {
        User user = new User();
        user.setUserName("张三");
        user.setPassword("1111");
        int i = userMapper.insertSelective(user);
        Assert.assertTrue(i>0);
    }

    @Test
    public void testRedis(){
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("hjrpc","hujian");
        System.out.println(valueOperations.get("hjrpc"));
    }

    @Test
    public void testAtomikosService(){
        testAtomikosService.insertSelective();
    }
}