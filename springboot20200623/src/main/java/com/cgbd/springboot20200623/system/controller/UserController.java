package com.cgbd.springboot20200623.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户：控制层
 *
 * @AUTHOR ZLF
 * @CREATE 2020-06-23 9:52
 */
@Controller
public class UserController {
    @RequestMapping("/userController/login")
    @ResponseBody
    public String login() {
        return "登录控制层返回信息!!!";
    }
}
