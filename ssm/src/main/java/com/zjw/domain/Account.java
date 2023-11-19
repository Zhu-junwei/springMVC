package com.zjw.domain;

import lombok.*;

import java.io.Serializable;

/**
 * 账户
 * @author 朱俊伟
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {

    private Integer id;
    private String name;
    private Double money;

}
