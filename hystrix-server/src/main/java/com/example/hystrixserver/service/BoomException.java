package com.example.hystrixserver.service;

/**
 * @author answer
 * @description
 * @create 2017/12/21 17:28
 **/
public class BoomException extends RuntimeException{

    public BoomException(String message){
        super(message);
    }
}
