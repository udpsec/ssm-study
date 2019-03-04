package com.inofd.ssm.web.controller;

import com.inofd.ssm.domain.OrderExt;
import com.inofd.ssm.mapper.OrdersMapper;
import com.inofd.ssm.service.impl.OrdersService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.InputStream;

public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    InputStream in = null;
    SqlSessionFactory build = null;
    SqlSession sqlSession = null;

    @Test
    public void test1() throws IOException {
        in = Resources.getResourceAsStream("spring-mybatis.xml");
        build = new SqlSessionFactoryBuilder().build(in);
        sqlSession = build.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrderExt orderUser = mapper.findOrderUser(5);
        System.out.println(orderUser.getNumber());
        sqlSession.close();
    }
}
