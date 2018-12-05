package com.leon.demo.service.hystric;

import com.leon.demo.service.UserRemoteService;
import org.springframework.stereotype.Component;

/**
 * UserRemoteServiceHystric
 *
 * @author leon
 * @date 2018/12/4
 */
@Component
public class UserRemoteServiceHystric implements UserRemoteService {

    @Override
    public String test(String name) {
        return "hi,"+ name +",sorry,error!";
    }
    
}
