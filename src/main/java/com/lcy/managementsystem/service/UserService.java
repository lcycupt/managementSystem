package com.lcy.managementsystem.service;

import com.lcy.managementsystem.bean.User;
import com.lcy.managementsystem.dao.UserDao;
import com.lcy.managementsystem.service.serviceImpl.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserServiceInter {
    @Autowired
    UserDao userDao;
    @Override
    public String judgeLogin(Integer username,String password) {

        User user = userDao.findByUsername(username);
        List<User> userList = userDao.findAll();
        System.out.println(userList);
        if(user.getPassword().equals(password)){
            return "1";
        }else
            return "2";
    }

    @Override
    public List<User> getUserTable() {
        return null;
    }
}
