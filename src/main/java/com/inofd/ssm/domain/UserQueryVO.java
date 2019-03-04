package com.inofd.ssm.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserQueryVO {
    private User user;
    private List<Integer> ids;
}
