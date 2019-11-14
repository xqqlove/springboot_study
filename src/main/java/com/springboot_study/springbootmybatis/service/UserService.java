package com.springboot_study.springbootmybatis.service;

import com.springboot_study.springbootmybatis.entity.User;
import com.springboot_study.springbootmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> Sel(){
        return userMapper.Sel();
    }
}
