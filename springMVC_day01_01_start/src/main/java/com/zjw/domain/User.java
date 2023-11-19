package com.zjw.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 朱俊伟
 */
@Setter
@Getter
@ToString
public class User implements Serializable {

    private String uname;

    private Integer age;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
}
