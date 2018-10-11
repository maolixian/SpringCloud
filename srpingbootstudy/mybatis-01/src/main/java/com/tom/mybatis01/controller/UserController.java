package com.tom.mybatis01.controller;

import com.tom.mybatis01.entity.UserEntity;
import com.tom.mybatis01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by maolixian on 2018/10/11
 */
@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/All")
    public List<UserEntity> getAllUserList(){
        return userService.getAllUserList();
    }
}
