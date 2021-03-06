package com.forezp.servicemiya.controller;

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
public class MiyaController {
    private static final Logger log=Logger.getLogger(MiyaController.class.getName());

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String home()
    {
        log.log(Level.INFO,"hi is being called");

        return "hi i'm miya";
    }

    @RequestMapping("/miya")
    public String info()
    {
        log.log(Level.INFO,"info is being called");

        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }
}
