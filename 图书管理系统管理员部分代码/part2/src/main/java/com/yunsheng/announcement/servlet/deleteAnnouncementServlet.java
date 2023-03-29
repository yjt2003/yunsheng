package com.yunsheng.announcement.servlet;

import com.yunsheng.announcement.service.AnnouncementService;
import com.yunsheng.announcement.service.AnnouncementServiceImlp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/announcement/servlet/deleteAnnouncementServlet/")

public class deleteAnnouncementServlet extends HttpServlet {

    private AnnouncementService announcementService = new AnnouncementServiceImlp();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("Content-TYPE","text/html;charset=UTF-8");
        String time = req.getParameter("time");
        resp.getWriter().println(time);
        int result = announcementService.deleteAnnouncement(time);
        if(result > 0){
            resp.getWriter().println("删除成功");
        }else{
            resp.getWriter().println("删除失败");
        }
    }
}
