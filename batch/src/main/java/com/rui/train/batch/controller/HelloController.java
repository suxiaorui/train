package com.rui.train.batch.controller;

import com.rui.train.batch.feign.BusinessFeign;
import com.rui.train.batch.job.DailyTrainJob;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/9 8:15
 * @Version 1.0
 */
@RestController
public class HelloController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @Resource
    BusinessFeign businessFeign;

    @GetMapping("/hello")
    public String hello(){
        String businessHello = businessFeign.hello();
        LOG.info(businessHello);
        return "hello~~~";
    }
}
