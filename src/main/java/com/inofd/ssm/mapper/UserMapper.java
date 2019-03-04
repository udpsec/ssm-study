package com.inofd.ssm.mapper;

import com.inofd.ssm.domain.User;

import java.util.List;

/**
* Created by Mybatis Generator 2019/03/04
*/
public interface UserMapper {

    User findUserById(Integer integer);
    User findUserByIdResultMap(Integer integer);
    List<User> findUserByName(String string);
    void insertUser(User user);
    void deleteUserById(Integer id);
    void updatebyid(Integer id);
}