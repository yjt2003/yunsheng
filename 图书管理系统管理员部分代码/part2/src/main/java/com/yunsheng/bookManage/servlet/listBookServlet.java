package com.yunsheng.bookManage.servlet;

import com.alibaba.fastjson2.JSONObject;
import com.yunsheng.bookManage.model.Book;
import com.yunsheng.bookManage.service.BookService;
import com.yunsheng.bookManage.service.BookServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/bookManage/servlet/listBookServlet/")
public class listBookServlet extends HttpServlet {
    private BookService bookService = new BookServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        List<Book> list = bookService.queryBooks();
        String jsonObject = JSONObject.toJSONString(list);
        resp.getWriter().println(jsonObject);
    }
}
