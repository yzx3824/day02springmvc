package com.yzx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: day02springmvc
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-26 19:22
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        System.out.println("testInterceptor执行了...");
        return "success";
    }
}
