package com.inofd.ssm.utils;

import com.inofd.ssm.service.UserService;
import com.inofd.ssm.service.impl.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class MyBeanFactory {
    public static UserService createProxyUser() {
        final UserServiceImpl userService = new UserServiceImpl();
        final MyAspet myAspet = new MyAspet();
        /*UserService proxyUserService = (UserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                myAspet.before();
                Object invoke = method.invoke(userService, objects);
                myAspet.after();
                return invoke;
            }
        });
        return proxyUserService;*/
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspet.before();
                Object o1 = methodProxy.invokeSuper(o, objects);

                myAspet.after();
                return  o1;
            }
        });
        UserServiceImpl o2 = (UserServiceImpl) enhancer.create();
        return o2;
    }
}
