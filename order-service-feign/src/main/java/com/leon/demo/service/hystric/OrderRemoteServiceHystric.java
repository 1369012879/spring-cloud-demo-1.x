package com.leon.demo.service.hystric;

import com.leon.demo.service.OrderRemoteService;
import org.springframework.stereotype.Component;

/**
 * OrderRemoteServiceHystric
 *
 * @author leon
 * @date 2018/12/4
 */
@Component
public class OrderRemoteServiceHystric implements OrderRemoteService {

    @Override
    public String test(String name) {
        return "hi,"+ name +",sorry,error!";
    }

}
