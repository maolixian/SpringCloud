package com.tom.mybatis01.service;

import com.tom.mybatis01.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by maolixian on 2018/10/11
 */
public interface UserService {
    List<UserEntity> getAllUserList();
}
