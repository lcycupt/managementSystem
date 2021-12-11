package com.lcy.managementsystem.dao;

import com.lcy.managementsystem.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * 查找我们所有的用户
     * @return 返回list
     */
    public List<User> findAll();
    /**
     * 添加我们所有用户的操作
     * @return 添加成功返回true
     */
    public boolean addUser(User user);

    /**
     * 更新我们所有用户的操作
     * @return 添加成功返回true
     */
    public boolean updateUser(User user);

    /**
     * 删除我们所有用户的操作
     * @return 添加成功返回true
     */
    public boolean deleteUser(Integer username);

    /**
     * 根据用户名查找用户
     * @return 返回单个用户
     */
    public User findByUsername(Integer username);
}
