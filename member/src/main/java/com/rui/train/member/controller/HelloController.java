package com.rui.train.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/9 8:15
 * @Version 1.0
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${test.nacos}")
    private String testNacos;

    @GetMapping("/hello")
    public String hello(){
        return String.format("Hello %s! ", testNacos);
    }
}
