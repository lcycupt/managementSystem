package com.lcy.managementsystem.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录检查操作
 * 1.配置好的拦截器拦截哪些请求
 * 2.把这些配置放在容器中
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    /**
     *在目标方法执行之前
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        log.info("拦截的路径是{}",requestURI);
        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");
        log.info("username的值是{}",username);
        if (username!=null){
            return true;
        }
        session.setAttribute("msg","请先登录");
        response.sendRedirect("/login");

        return false;
    }
    /**
     *在目标方法执行之后
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    log.info("postHandle执行了{}",modelAndView);
    }
    /**
     *页面渲染之后
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        log.info("afterCompletion执行了{}",ex);
    }
}
