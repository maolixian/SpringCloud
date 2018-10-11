package com.tom.mybatis01.mapper;

import com.tom.mybatis01.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * created by maolixian on 2018/10/11
 */
@Mapper
public interface UserMapper {
    public List<UserEntity> getAllUserList();
}
