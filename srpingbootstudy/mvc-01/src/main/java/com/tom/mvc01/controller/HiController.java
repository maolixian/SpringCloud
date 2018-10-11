package com.tom.mvc01.controller;

import com.tom.mvc01.entity.OrderPostForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * created by maolixian on 2018/9/30
 */
@Controller
public class HiController {

    @GetMapping("saveOrder")
    public String saveOrder()
    {
        return "/hi/saveOrder";
    }

    @PostMapping("saveOrder")
    public String saveOrder(OrderPostForm form)
    {
        return "/hi/success";
    }
}
