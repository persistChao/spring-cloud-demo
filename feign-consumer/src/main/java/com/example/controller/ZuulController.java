package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author answer
 * @description 用于测试 zuul 网关
 * @create 2018/1/18 16:30
 **/
@RestController
public class ZuulController {

    @GetMapping("/user")
    public String getUser() {
        User user = new User();
        user.setAge(20);
        user.setCity("beijing");
        user.setName("jack");
        return JSONObject.toJSONString(user);
    }
}
