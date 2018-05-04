package com.example.trace1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author answer
 * @description
 * @create 2018/3/28 11:03
 **/
@RestController
public class TraceController {

    private static final Logger logger = LoggerFactory.getLogger(TraceController.class);

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/trace1")
    public String trace(){
        logger.info("====《call trace1》====");
        return restTemplate.getForEntity("http://trace2/trace2" , String.class).getBody();
    }
}
