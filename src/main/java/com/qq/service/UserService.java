package com.qq.service;

import com.qq.entity.User;
import com.qq.mapper.UserMapper;
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
