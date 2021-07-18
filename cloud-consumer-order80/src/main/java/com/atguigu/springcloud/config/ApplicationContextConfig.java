package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced 重写轮询方法之后要去掉默认的，看看ordermain中的myself方法
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
