package com.example.service;/**
 * Create by 苏超 on 2017/10/25.<br>
 */

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @description
 * @create 14:38
 **/
@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello{
    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry "+name;
    }
}
