package com.leon.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.leon.demo.ConfigClientApplication
 *
 * @author leon
 * @date 2018/12/5
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }

}
