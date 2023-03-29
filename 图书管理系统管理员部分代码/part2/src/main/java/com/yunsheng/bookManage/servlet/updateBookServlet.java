package com.yunsheng.bookManage.servlet;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.yunsheng.bookManage.model.Book;
import com.yunsheng.bookManage.service.BookService;
import com.yunsheng.bookManage.service.BookServiceImpl;
import com.alibaba.dubbo.common.utils.IOUtils;
import com.yunsheng.util.Data;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/bookManage/servlet/updateBookServlet/")
public class updateBookServlet extends HttpServlet {
    private BookService bookService = new BookServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        JSONObject jo1 = Data.get(req);
          Book book = JSON.parseObject(String.valueOf(jo1),Book.class);
        int result = bookService.updateBook(book);//更改成功
        if (result == -1) {
            resp.getWriter().println("更改失败");
        } else {
            resp.getWriter().println("更改成功");
        }
    }
}