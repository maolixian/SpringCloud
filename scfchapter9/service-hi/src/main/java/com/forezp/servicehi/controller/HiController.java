package com.forezp.servicehi.controller;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * created by maolixian on 2018/9/25
 */
@RestController
public class HiController {
    private static final Logger log=Logger.getLogger(HiController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

    @RequestMapping("/hi")
    public String callHome(){
        log.log(Level.INFO, "calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8989/hi", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        log.log(Level.INFO, "calling trace service-hi ");

        return "i'm service-hi";
    }
}
