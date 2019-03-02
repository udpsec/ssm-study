package com.inofd.ssm.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public void insertUser();
    public void updateUser();
    public void selectUser();
    public void deleteUser();
}
