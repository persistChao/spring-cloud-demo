package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author answer
 * @description
 * @create 2018/1/17 17:06
 **/
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class , args);
        new SpringApplicationBuilder(Application.class).web(false).run(args);
    }
}
