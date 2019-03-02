package com.inofd.ssm.web.controller;

import com.inofd.ssm.service.impl.UserServiceImpl;
import com.inofd.ssm.utils.MyBeanFactory;
import org.junit.Test;

public class TestProxy {
    @Test
    public void test1(){
        UserServiceImpl proxyUser = (UserServiceImpl) MyBeanFactory.createProxyUser();
        proxyUser.addUser();
    }
}
