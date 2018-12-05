package com.leon.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClientController
 *
 * @author leon
 * @date 2017/12/5
 */
@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")

    public String hi(){
        return foo;
    }

}
