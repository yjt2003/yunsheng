package com.yunsheng.userManage.servlet;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
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

@WebServlet("/userManage/servlet/useUserServlet/")

public class useUserServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        JSONObject jo1 = Data.get(req);
        User user = JSON.parseObject(String.valueOf(jo1),User.class);
        int result = userService.useUser(user);//更改信息
        if (result == -1) {
            resp.getWriter().println("解封失败");
        } else {
            resp.getWriter().println("解封成功");
        }
    }
}
