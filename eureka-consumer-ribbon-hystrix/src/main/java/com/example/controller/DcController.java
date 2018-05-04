package com.example.controller;

import com.example.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author answer
 * @description
 * @create 2018/1/16 15:02
 **/
@RestController
public class DcController {

    private static final Logger logger = LoggerFactory.getLogger(DcController.class);

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        System.out.println("请求进入......");
        logger.info("ribbon 调用 .....");
        int a  = 1;
        return consumerService.consumer();
    }
}
