package com.inofd.ssm.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("user")
public class SpringDemo {
    @RequestMapping("hello")
    public void hello(HttpServletRequest request, HttpServletResponse response, ModelAndView mv, Model model) {

        Model model1 = model.addAttribute("hello", "hello spring");
        mv.addObject(model1);
        mv.setViewName("index");
    }
}
