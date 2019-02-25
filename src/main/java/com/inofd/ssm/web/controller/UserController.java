package com.inofd.ssm.web.controller;

import com.inofd.ssm.domain.User;
import com.inofd.ssm.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserServiceImpl userService;
    @GetMapping("find")
    public void find(){
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.printf(user.getName());
            System.out.printf(user.getPassword());
        }
    }
}
