package com.rui.train.member.config;

import com.rui.train.common.interceptor.LogInterceptor;
import com.rui.train.common.interceptor.MemberInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/12 17:36
 * @Version 1.0
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    private LogInterceptor logInterceptor;

    @Autowired
    private MemberInterceptor memberInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor);

        registry.addInterceptor(memberInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(
                        "/hello",
                        "/member/send-code",
                        "/member/login"
                );
    }

}
