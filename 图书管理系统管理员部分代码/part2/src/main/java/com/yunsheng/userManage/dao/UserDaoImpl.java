package com.yunsheng.userManage.dao;


import com.yunsheng.userManage.model.User;
import com.yunsheng.BaseDao;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {


    @Override
    public User queryUserByAccountAndPassword(String account,String password) {
        String sql = "select * from user where account = ? and  password = ?";
        return queryForOne(User.class,sql,account,password);
    }

    @Override
    public int useUser(User user) {
        String sql = "update user set status = 0 where name = ?";
        return update(sql,user.getName());
    }

    @Override
    public int banUser(User user) {
        String sql = "update user set status = 0 where name = ?";
        return update(sql,user.getName());
    }

    @Override
    public List<User> queryUsers() {
        String sql = "select * from user";
        return queryForList(User.class,sql);
    }
}
