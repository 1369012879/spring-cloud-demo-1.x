package com.leon.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author leon
 * @date
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam(value = "name", required = true) String name){
        return name + "，i am user-service form " + port;
    }

}
