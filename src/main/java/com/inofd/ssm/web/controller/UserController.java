package com.inofd.ssm.web.controller;

import com.inofd.ssm.domain.User;
import com.inofd.ssm.service.impl.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    InputStream in = null;
    SqlSessionFactory build = null;
    SqlSession sqlSession = null;

   @Test
    public void  test1() throws IOException {
       in = Resources.getResourceAsStream("spring-mybatis.xml");
       build = new SqlSessionFactoryBuilder().build(in);
       sqlSession = build.openSession();
       User findUserById = sqlSession.selectOne("findUserById",29);
       System.out.println(findUserById);
       sqlSession.close();
   }
    @Test
    public void  test2() throws IOException {
        in = Resources.getResourceAsStream("spring-mybatis.xml");
        build = new SqlSessionFactoryBuilder().build(in);
        sqlSession = build.openSession();
        List<User> userList = sqlSession.selectList("findUserByName","张");
        System.out.println(userList);
        sqlSession.close();
    }
    @Test
    public void  test3() throws IOException {
        in = Resources.getResourceAsStream("spring-mybatis.xml");
        build = new SqlSessionFactoryBuilder().build(in);
        sqlSession = build.openSession();
        sqlSession.insert("insertUser",new User(null,"ao122",new Date(),"男","18"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void  test4() throws IOException {
        in = Resources.getResourceAsStream("spring-mybatis.xml");
        build = new SqlSessionFactoryBuilder().build(in);
        sqlSession = build.openSession();
        sqlSession.delete("deleteUserById",26);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void  test5() throws IOException {
        in = Resources.getResourceAsStream("spring-mybatis.xml");
        build = new SqlSessionFactoryBuilder().build(in);
        sqlSession = build.openSession();
        User user = new User();
        user.setId(1);
        user.setUsername("奥力给");
        user.setSex("3");
        sqlSession.update("updatebyid",user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void  test6() throws IOException {
        in = Resources.getResourceAsStream("spring-mybatis.xml");
        build = new SqlSessionFactoryBuilder().build(in);
        sqlSession = build.openSession();
        User findUserByIdResultMap = sqlSession.selectOne("findUserByIdResultMap", 29);
        System.out.println(findUserByIdResultMap.getUsername());
        sqlSession.close();
    }
}
