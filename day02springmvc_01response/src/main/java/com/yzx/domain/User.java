package com.yzx.domain;

import java.io.Serializable;

/**
 * @program: day02springmvc
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-26 12:00
 */
public class User implements Serializable {

    private String username;
    private String password;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

