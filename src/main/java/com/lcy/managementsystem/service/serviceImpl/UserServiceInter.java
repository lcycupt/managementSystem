package com.lcy.managementsystem.service.serviceImpl;

import com.lcy.managementsystem.bean.User;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserServiceInter {
    /**
     * 判断我们得登录操作
     * @return 登录成功返回1，登录失败返回2，用户不存在返回3
     */
    public String judgeLogin(Integer username,String password);

    /**
     * 找到返回列表
     */
    public List<User> getUserTable();
    }


