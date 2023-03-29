package com.yunsheng.record.servlet;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.yunsheng.bookManage.model.Book;
import com.yunsheng.record.model.Record;
import com.yunsheng.record.service.RecordService;
import com.yunsheng.record.service.RecordServiceImpl;
import com.yunsheng.util.Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/record/servlet/addRecordServlet/")
public class addRecordServlet extends HttpServlet {

    private RecordService recordService = new RecordServiceImpl();



        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doPost(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=UTF-8");
            JSONObject jo1 = Data.get(req);
            Record record = JSON.parseObject(String.valueOf(jo1),Record.class);
            int result = recordService.addRecord(record);//审批
            if(result == -1){
                resp.getWriter().println("通过失败");
            }else{
                resp.getWriter().println("通过成功");
            }
        }
    }
