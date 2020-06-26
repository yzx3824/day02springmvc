package com.yzx.exception;

/**
 * @program: day02springmvc
 * @description: 自定义异常类
 * @author: yanzhixian
 * @create: 2020-06-26 19:03
 */
public class SysException extends Exception{
    // 存储提示信息的
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
