package com.inofd.ssm.service.impl;

import com.inofd.ssm.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("add");
    }

    @Override
    public void updateUser() {
        System.out.println("update");

    }

    @Override
    public void deleteUser() {
        System.out.println("delete");
    }

    @Override
    public void selectUser() {
        System.out.println("select");
    }
}
