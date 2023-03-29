package com.yunsheng.announcement.servlet;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.yunsheng.announcement.model.Announcement;
import com.yunsheng.announcement.service.AnnouncementService;
import com.yunsheng.announcement.service.AnnouncementServiceImlp;
import com.yunsheng.util.Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/announcement/servlet/addAnnouncementServlet/")

public class addAnnouncementServlet extends HttpServlet {

    private AnnouncementService announcementService = new AnnouncementServiceImlp();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        JSONObject jo1 = Data.get(req);
        Announcement announcement = JSON.parseObject(String.valueOf(jo1),Announcement.class);
        int result = announcementService.addAnnouncement(announcement);//写入数据库
        if(result == -1){
            resp.getWriter().println("增加失败");
        }else{
            resp.getWriter().println("增加成功");
        }
    }
}
