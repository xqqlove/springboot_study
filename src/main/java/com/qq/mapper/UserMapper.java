package com.qq.mapper;

import com.qq.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel();
}
