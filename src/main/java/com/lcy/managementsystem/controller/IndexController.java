package com.lcy.managementsystem.controller;

import com.lcy.managementsystem.service.UserService;
import com.lcy.managementsystem.service.serviceImpl.UserServiceInter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
@Slf4j
@Controller
public class IndexController {
    @Autowired
    UserService userService;
    @GetMapping(value={"/","/login"})
    public String loginPage(){
        return "login";
    }
    @PostMapping("/login")
    public String loginJudge(Integer username, String password, HttpSession session, Model model){
        String msg = userService.judgeLogin(username, password);
        if(msg.equals("1")) {
            session.setAttribute("username", username);
            return "redirect:/main.html";
        }
            session.setAttribute("msg","账号或者密码错误");
            return "login";
    }
    @GetMapping("/main.html")
    public String goMain(HttpSession session,Model model){
        log.info("main页面执行了");
        return "main";
    }
}
