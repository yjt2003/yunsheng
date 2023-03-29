package com.yunsheng.bookManage.servlet;
import com.yunsheng.bookManage.service.BookService;
import com.yunsheng.bookManage.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bookManage/servlet/deleteBookServlet/")
public class deleteBookServlet extends HttpServlet {
    private BookService bookService = new BookServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("Content-TYPE","text/html;charset=UTF-8");
       String name = req.getParameter("name");
        int result = bookService.deleteBook(name);
        if(result > 0){
            resp.getWriter().println("删除成功");
        }else{
            resp.getWriter().println("删除失败");
        }
    }
}
