package com.rui.train.batch.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/17 17:05
 * @Version 1.0
 */
@FeignClient(name = "business", url = "http://127.0.0.1:8002/business")
public interface BusinessFeign {

    @GetMapping("/hello")
    String hello();
}
