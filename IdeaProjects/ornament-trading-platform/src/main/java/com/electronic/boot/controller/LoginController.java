package com.electronic.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RequestMapping("")
public class LoginController {
    /**
     * @Description 访问登录页面
     * @Param session
     * @Return
     * @Author electroNic
     * @Date 2022/10/30 17:43
     */
    @GetMapping({"/", "/login", "/login.html"})
    public String toLoginPage(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "redirect:/index";
        }
        return "sign-in";
    }
}
