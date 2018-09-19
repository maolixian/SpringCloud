package com.forezp.serviceribbon.controller;

import com.forezp.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by maolixian on 2018/9/18
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hello(@RequestParam String name) {
        return helloService.Hello(name);
    }
}
