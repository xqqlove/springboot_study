package com.mybatisGenerator.springboot.service;

import com.mybatisGenerator.springboot.Dao.UserMapper;
import com.mybatisGenerator.springboot.Entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> Sel(){
        return userMapper.selectAll();
    }
}
