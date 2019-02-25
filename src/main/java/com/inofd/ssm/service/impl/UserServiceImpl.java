package com.inofd.ssm.service.impl;

import com.inofd.ssm.dao.UserDao;
import com.inofd.ssm.domain.User;
import com.inofd.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public List<User> findAll(){
        return userDao.findAll();
    }
}
