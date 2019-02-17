package com.inofd.ssm.web.controller;


import com.inofd.ssm.entity.Department;
import com.inofd.ssm.service.DepartmentService;
import com.inofd.ssm.util.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * 处理和部门有关的请求
 */
@Controller
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    /**
     * 返回所有的部门信息
     */
    @RequestMapping("/depts")
    @ResponseBody
    public Message getDepts(){
        List<Department> list = departmentService.getDepts();

        return Message.success().add("depts", list);
    }
}
