package com.yunsheng.userManage.servlet;


import com.alibaba.fastjson2.JSON;
import com.yunsheng.userManage.model.User;
import com.yunsheng.userManage.service.UserService;
import com.yunsheng.userManage.service.UserServiceImpl;
import com.yunsheng.util.Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/userManage/servlet/LoginServlet/")
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");

        User user = JSON.parseObject(String.valueOf(Data.get(req)),User.class);
        User loginUser = userService.login(user);
        if(loginUser == null){
            resp.getWriter().println("0");
        }else{
            if(loginUser.getStatus() == 0){
            if(Data.normalstr(loginUser.getAccount()) ==false){
                resp.getWriter().println("1");//管理员
            }else {
                resp.getWriter().println("2");//common
            }
        }else{
                resp.getWriter().println("ban");
            }
        }
    }
}