package com.forezp.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by maolixian on 2018/9/19
 */
@RestController
@RefreshScope
public class HiController {
    @Value("${foo}")
    String foo;
    @GetMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
