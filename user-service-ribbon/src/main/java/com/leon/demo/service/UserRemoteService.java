package com.leon.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * UserRemoteService
 *
 * @author leon
 * @date 2018/12/4
 */
@Service
public class UserRemoteService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * orderRemoteServiceHystric
     * @param name
     * @return
     */
    public String orderRemoteServiceHystric(String name) {
        return "hi,"+ name +",sorry,error!";
    }

    /**
     * test
     *
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "orderRemoteServiceHystric")
    public String test(String name){
        return restTemplate.getForObject("http://USER-SERVICE-9003/user/test?name=" + name, String.class);
    }

}
