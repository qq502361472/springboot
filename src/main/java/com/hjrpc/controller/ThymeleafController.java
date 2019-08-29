package com.hjrpc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(ModelMap map) {
        // 设置属性
        map.addAttribute("name", "haha");
        // testThymeleaf.html：为模板文件的名称
        // 对应src/main/resources/templates/testThymeleaf.html.html
        return "testThymeleaf.html";
    }
}
