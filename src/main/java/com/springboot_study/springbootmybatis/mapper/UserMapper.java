package com.springboot_study.springbootmybatis.mapper;

import com.springboot_study.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> Sel();
}
