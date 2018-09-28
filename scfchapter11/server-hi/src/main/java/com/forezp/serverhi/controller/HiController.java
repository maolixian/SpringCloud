package com.forezp.serverhi.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by maolixian on 2018/9/28
 */
@RestController
public class HiController {
//    @RequestMapping("/hi")
//    @HystrixCommand(fallbackMethod = "hiError")
//    public String home(@RequestParam(defaultValue = "mao") String name) {
//        return "hi , " + name;
//    }
//
//    public String hiError(String name) {
//        return "hi,"+name+",sorry,error!";
//    }
}
