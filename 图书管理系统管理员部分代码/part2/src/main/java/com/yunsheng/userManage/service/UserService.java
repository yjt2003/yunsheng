package com.yunsheng.userManage.service;

import com.yunsheng.userManage.model.User;

import java.util.List;

public interface UserService {

    public User login(User user);

    public int useUser(User user);

    public int banUser(User user);

    public List<User> queryUsers();

}
