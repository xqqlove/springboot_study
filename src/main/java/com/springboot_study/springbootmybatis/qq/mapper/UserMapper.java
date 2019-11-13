package com.springboot_study.springbootmybatis.qq.mapper;

import com.springboot_study.springbootmybatis.qq.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> Sel();
}
