package com.zjw.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 自定义异常类
 * @author 朱俊伟
 */
@Getter
@Setter
@AllArgsConstructor
public class SysException extends Exception {

    /**
     * 存储提示信息
     */
    private String message ;

}
