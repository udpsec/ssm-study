package com.inofd.ssm.dao;

import com.inofd.ssm.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    List<User> findAll();
}
