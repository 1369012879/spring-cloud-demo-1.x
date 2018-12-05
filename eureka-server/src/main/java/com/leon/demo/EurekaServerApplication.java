package com.leon.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServerApplication 启动服务注册与发现
 *
 * @author leon
 * @date 2018/12/3
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    /**
     * TODO 保留了解这两种启动方式的区别 SpringApplication.run(EurekaServerApplication.class, args);
     * @param args
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }

}
