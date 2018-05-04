package com.example.job;/**
 * Create by 苏超 on 2017/11/9.<br>
 */

import org.assertj.core.internal.Dates;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Administrator
 * @description
 * @create 11:04
 **/
@Component
public class Job {
    public final static long ONE_Minute =  60 * 1000;

    @Scheduled(fixedDelay=ONE_Minute)
    public void fixedDelayJob(){
//        System.out.println(Dates.format_yyyyMMddHHmmss(new Date())+" >>fixedDelay执行....");
        System.out.println(" >>fixedDelay执行....");
    }

    @Scheduled(fixedRate=ONE_Minute)
    public void fixedRateJob(){
//        System.out.println(Dates.format_yyyyMMddHHmmss(new Date())+" >>fixedRate执行....");
        System.out.println(" >>fixedRate执行....");
    }

    @Scheduled(cron="0 15 3 * * ?")
    public void cronJob(){
//        System.out.println(Dates.format_yyyyMMddHHmmss(new Date())+" >>cron执行....");
        System.out.println(" >>cron执行....");
    }
}
