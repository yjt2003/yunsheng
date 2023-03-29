package com.yunsheng.record.servlet;

import com.alibaba.fastjson2.JSONObject;
import com.yunsheng.bookManage.model.Book;
import com.yunsheng.record.model.Record;
import com.yunsheng.record.service.RecordService;
import com.yunsheng.record.service.RecordServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/record/servlet/listRecordServlet/")
public class listRecordServlet extends HttpServlet {

    private RecordService recordService = new RecordServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        List<Record> list = recordService.queryRecords();
        String jsonObject = JSONObject.toJSONString(list);
        resp.getWriter().println(jsonObject);
    }
}
