package com.yunsheng.userManage.dao;

import com.yunsheng.userManage.model.User;

import java.util.List;

public interface UserDao {

    public User queryUserByAccountAndPassword(String account,String password);

    public int useUser(User user);

    public int banUser(User user);

    public List<User> queryUsers();

}
