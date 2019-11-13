package com.springboot_study.springbootmybatis;

import com.springboot_study.springbootmybatis.qq.entity.User;
import com.springboot_study.springbootmybatis.qq.service.UserService;
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
