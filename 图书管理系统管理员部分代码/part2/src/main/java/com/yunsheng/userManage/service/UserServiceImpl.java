package com.yunsheng.userManage.service;

import com.yunsheng.userManage.dao.UserDao;
import com.yunsheng.userManage.dao.UserDaoImpl;
import com.yunsheng.userManage.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserDao userDao = new UserDaoImpl();

    @Override
    public User login(User user) {
        return userDao.queryUserByAccountAndPassword(user.getAccount(),user.getPassword());
    }

    @Override
    public int useUser(User user) {
        userDao.useUser(user);
        return 0;
    }

    @Override
    public int banUser(User user) {
        userDao.banUser(user);
        return 0;
    }

    @Override
    public List<User> queryUsers() {
        return userDao.queryUsers();
    }
}
