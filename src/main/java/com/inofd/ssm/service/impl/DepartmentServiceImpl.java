package com.inofd.ssm.service.impl;

import com.inofd.ssm.dao.DepartmentMapper;
import com.inofd.ssm.entity.Department;
import com.inofd.ssm.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepts() {
        //查出的所有部门信息
        return departmentMapper.selectByExample(null);
    }
}
