package com.leon.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * OrderServiceFeignApplication
 *
 * @author leon
 * @date 2018/12/4
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderServiceFeignApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderServiceFeignApplication.class).web(true).run(args);
    }
    
}
