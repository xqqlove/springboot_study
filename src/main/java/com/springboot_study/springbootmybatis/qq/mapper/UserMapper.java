package com.springboot_study.springbootmybatis.qq.mapper;

import com.springboot_study.springbootmybatis.qq.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel();
}
