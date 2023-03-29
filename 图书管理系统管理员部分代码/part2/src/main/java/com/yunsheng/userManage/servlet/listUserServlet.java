package com.yunsheng.userManage.servlet;

import com.alibaba.fastjson2.JSONObject;
import com.yunsheng.bookManage.model.Book;
import com.yunsheng.userManage.model.User;
import com.yunsheng.userManage.service.UserService;
import com.yunsheng.userManage.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userManage/servlet/listUserServlet/")

public class listUserServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        List<User> list = userService.queryUsers();
        String jsonObject = JSONObject.toJSONString(list);
        resp.getWriter().println(jsonObject);
    }
}
