package com.inofd.ssm.web.controller;

import com.inofd.ssm.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @Test
    public void addUser()  {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserServiceImpl bean = context.getBean(UserServiceImpl.class);

    }
}
