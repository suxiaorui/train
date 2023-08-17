package com.rui.train.batch.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/17 0:01
 * @Version 1.0
 */
@SpringBootApplication
@ComponentScan("com.rui")
@MapperScan("com.rui.train.*.mapper")
@EnableFeignClients("com.rui.train.batch.feign")
public class BatchApplication {

    private static final Logger LOG = LoggerFactory.getLogger(BatchApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BatchApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
    }
}
