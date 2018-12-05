package com.leon.demo.controller;

import com.leon.demo.service.UserRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author leon
 * @date 2018/12/4
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserRemoteService remoteService;

    @RequestMapping(value = "/test/ribbon", method = RequestMethod.GET)
    public String test(@RequestParam(value = "name", required = true) String name){
        return remoteService.test(name);
    }

}
