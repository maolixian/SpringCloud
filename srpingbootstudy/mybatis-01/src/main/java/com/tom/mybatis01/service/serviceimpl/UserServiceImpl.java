package com.tom.mybatis01.service.serviceimpl;

import com.tom.mybatis01.entity.UserEntity;
import com.tom.mybatis01.mapper.UserMapper;
import com.tom.mybatis01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by maolixian on 2018/10/11
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserEntity> getAllUserList() {
        return userMapper.getAllUserList();
    }
}
