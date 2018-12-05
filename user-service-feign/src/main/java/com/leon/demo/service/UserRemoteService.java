package com.leon.demo.service;

import com.leon.demo.service.hystric.UserRemoteServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * UserRemoteService
 *
 * @author leon
 * @date 2018/12/4
 */
@FeignClient(value = "USER-SERVICE-9003", fallback = UserRemoteServiceHystric.class)
public interface UserRemoteService {

    /**
     * test
     * @param name
     * @return
     */
    @RequestMapping(value = "/user/test", method = RequestMethod.GET)
    String test(@RequestParam(value = "name", required = true) String name);

}
