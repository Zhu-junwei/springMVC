package com.zjw.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author 朱俊伟
 */
@Getter
@Setter
@ToString
public class Account implements Serializable {

    private String username;

    private String password;

    private Double money;

    private User user;

    private List<User> list;

    private Map<String,User> map;
}
