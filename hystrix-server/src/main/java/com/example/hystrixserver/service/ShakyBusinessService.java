package com.example.hystrixserver.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @author answer
 * @description
 * @create 2017/12/21 16:56
 **/
@Service
public class ShakyBusinessService {

//    @HystrixCommand(fallbackMethod = "fallback")
//    @Retryable(include = BoomException.class)
    @CircuitBreaker(include = BoomException.class , openTimeout = 20000L,resetTimeout = 5000L , maxAttempts = 1)
    public int desireNumber() throws Exception {
        System.out.println("calling desireNumber()");
        if (Math.random() > .5) {
            System.out.println("循环内的次数======");
            Thread.sleep(1000 * 3);
            throw new RuntimeException("Boom");
        }
        return 1;
    }

    @Recover
    public int fallback(){
        return 400;
    }
}
