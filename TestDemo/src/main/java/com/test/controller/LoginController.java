package com.test.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aibinru
 * @date 24-7-16 10:40
 * @description: 前端和后端服务器不在一个地址，需要配置跨域
 */
@RequestMapping//前端配置了api前缀，后端不需要，
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "success";
    }

}
