package com.hjrpc.controller;


import com.hjrpc.model.User;
import com.hjrpc.service.UserService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/registerUser")
    public String registerUser(String userName,String password){
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        boolean result = userService.registerUser(user);
        Assert.assertTrue(result);
        return user.toString();
    }
    @RequestMapping("/login")
    public String login(String userName,String password){

        User user = userService.login(userName,password);
        if(user==null){
            return "登录失败";
        }
        return user.toString();
    }
}
