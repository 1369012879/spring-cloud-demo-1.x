package com.leon.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * OrderRemoteService
 *
 * @author leon
 * @date 2018/12/4
 */
@Service
public class OrderRemoteService {

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
        return restTemplate.getForObject("http://ORDER-SERVICE-9006/order/test?name=" + name, String.class);
    }

}
