package com.springboot_study.springbootmybatis.qq.controller;

import com.springboot_study.springbootmybatis.qq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public String GetUser(){
        return userService.Sel().toString();
    }

    @GetMapping ("/user")
    public String get(){
        return "hello";
    }
}
