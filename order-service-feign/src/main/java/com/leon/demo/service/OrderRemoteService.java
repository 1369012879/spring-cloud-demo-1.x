package com.leon.demo.service;

import com.leon.demo.service.hystric.OrderRemoteServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * OrderRemoteService
 *
 * @author leon
 * @date 2018/12/4
 */
@FeignClient(value = "ORDER-SERVICE-9006", fallback = OrderRemoteServiceHystric.class)
public interface OrderRemoteService {

    /**
     * test
     * @param name
     * @return
     */
    @RequestMapping(value = "/order/test", method = RequestMethod.GET)
    String test(@RequestParam(value = "name", required = true) String name);

}
