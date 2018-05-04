package com.example.eurekaclient;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author answer
 * @description
 * @create 2018/1/17 15:11
 **/
@RestController
public class ServiceProviderController {

    private static final Logger logger = LoggerFactory.getLogger(ServiceProviderController.class);

    @GetMapping("/hello")
    public String hello(){
        logger.debug("invoke feigen provider service ....");
        return "hello feigen...";
    }


    @GetMapping("/test")
    public String test(@RequestParam String name) {
        return "hello " + name;
    }

    @GetMapping("/test1")
    public User testParam(@RequestHeader String name ,@RequestHeader String city,
                            @RequestHeader Integer age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        user.setCity(city);
        System.out.println("测试Feign调用参数传递 result is : " + JSONObject.toJSONString(user));
        return user;
    }

    @PostMapping("/test2")
    public String testParam2(@RequestBody User user) {
        System.out.println(JSONObject.toJSONString(user));
        return "姓名:" + user.getName() + " 城市：" + user.getCity() + " 年龄：" + user.getAge();
    }
}
