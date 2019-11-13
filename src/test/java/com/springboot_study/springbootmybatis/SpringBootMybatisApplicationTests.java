package com.springboot_study.springbootmybatis;

import com.qq.entity.User;
import com.qq.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SpringBootMybatisApplication.class)
class SpringBootMybatisApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {

        User u = userService.Sel();
        System.out.println(u);
    }

}
