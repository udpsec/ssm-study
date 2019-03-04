package com.inofd.ssm.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
* Created by Mybatis Generator 2019/03/04
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "`user`")
public class User implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户名称
     */
    @Column(name = "username")
    private String username;

    /**
     * 生日
     */
    @Column(name = "birthday")
    private Date birthday;

    /**
     * 性别
     */
    @Column(name = "sex")
    private String sex;

    /**
     * 地址
     */
    @Column(name = "address")
    private String address;

    private static final long serialVersionUID = 1L;
}