package com.leon.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * OrderServiceRibbonApplication
 *
 * @author leon
 * @date 2018/12/4
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class OrderServiceRibbonApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderServiceRibbonApplication.class).web(true).run(args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
