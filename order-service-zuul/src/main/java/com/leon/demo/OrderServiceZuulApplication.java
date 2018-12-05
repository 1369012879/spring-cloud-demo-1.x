package com.leon.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * OrderServiceZuulApplication
 *
 * @author leon
 * @date 2018/12/5
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class OrderServiceZuulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderServiceZuulApplication.class).web(true).run(args);
    }

}
