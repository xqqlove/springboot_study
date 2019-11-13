package com.springboot_study.springbootmybatis.qq.service;

import com.springboot_study.springbootmybatis.qq.entity.User;
import com.springboot_study.springbootmybatis.qq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(){
        return userMapper.Sel();
    }
}
