package com.example.trace2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author answer
 * @description
 * @create 2018/3/28 11:21
 **/
@RestController
public class Trace2Controller {

    private static final Logger logger = LoggerFactory.getLogger(Trace2Controller.class);

    @GetMapping("/trace2")
    public String trace2() {
        logger.info("====<call trace2>======");
        return "trace2";
    }
}
