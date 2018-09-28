package com.forezp.serverhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by maolixian on 2018/9/26
 */
@RestController
public class HiController {
    @RequestMapping("/hi")
    public String home(@RequestParam(defaultValue = "mao") String name) {
        return "hi," + name;
    }
}
