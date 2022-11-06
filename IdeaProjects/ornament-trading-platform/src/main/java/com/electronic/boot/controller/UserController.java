package com.electronic.boot.controller;

import com.electronic.boot.bean.User;
import com.electronic.boot.service.UserService;
import com.electronic.boot.util.BitResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public ModelAndView login(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              HttpSession session) {
        ModelAndView mv = new ModelAndView();
        User user = userService.getUser(username, password);
        // 如果当前有用户登录则直接去到首页
        if (user != null) {
            session.setAttribute("user", user);
            mv.setViewName("redirect:/index");
            return mv;
        } else {
            mv.addObject("errorMsg", "用户名或密码错误");
        }
        mv.setViewName("sign-in");
        return mv;
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "sign-in";
    }

    @GetMapping("/toRegisterPage")
    public String toRegisterPage() {
        return "sign-up";
    }

    @PostMapping("/register")
    public ModelAndView register(User user, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        User userResult = userService.register(user);
        log.info("{}", userResult);
        session.setAttribute("user", userResult);
        mv.setViewName("redirect:/index");
        return mv;
    }

    @ResponseBody
    @GetMapping("/getUserById/{id}")
    public BitResult getUserById(@PathVariable("id") String id){
        User user = userService.getUserById(id);
        return new BitResult(user).success("ok");
    }

}
