package com.springboot_study.springbootmybatis;

import com.mybatisGenerator.springboot.SpringBootMybatisApplication;
import com.mybatisGenerator.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringBootMybatisApplication.class)
class SpringBootMybatisApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {


     
    }

}
