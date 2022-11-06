package com.electronic.boot.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    /**
     * @Description 登录拦截器
     * @Param
     * @Return
     * @Author electroNic
     * @Date 2022/10/30 17:47
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if (user != null) {
            return true;
        }
        request.setAttribute("errorMsg", "请登录！");
        request.getRequestDispatcher("/login").forward(request,response);
        return false;
    }
}
