//package com.rui.train.batch.config;
//
//import com.rui.train.batch.job.TestJob;
//import org.quartz.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author suxiaorui
// * @Description TODO
// * @Date 2023/8/17 0:28
// * @Version 1.0
// */
// @Configuration
// public class QuartzConfig {
//
//     /**
//      * 声明一个任务
//      * @return
//      */
//     @Bean
//     public JobDetail jobDetail() {
//         return JobBuilder.newJob(TestJob.class)
//                 .withIdentity("TestJob", "test")
//                 .storeDurably()
//                 .build();
//     }
//
//     /**
//      * 声明一个触发器，什么时候触发这个任务
//      * @return
//      */
//     @Bean
//     public Trigger trigger() {
//         return TriggerBuilder.newTrigger()
//                 .forJob(jobDetail())
//                 .withIdentity("trigger", "trigger")
//                 .startNow()
//                 .withSchedule(CronScheduleBuilder.cronSchedule("*/2 * * * * ?"))
//                 .build();
//     }
// }
