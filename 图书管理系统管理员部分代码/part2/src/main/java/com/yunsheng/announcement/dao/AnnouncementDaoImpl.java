package com.yunsheng.announcement.dao;

import com.yunsheng.BaseDao;
import com.yunsheng.announcement.model.Announcement;
import com.yunsheng.bookManage.model.Book;

import java.util.List;

public class AnnouncementDaoImpl extends BaseDao implements AnnouncementDao {
    @Override
    public int addAnnouncement(Announcement announcement) {
        String sql = "insert into announcement(`publisher`,`time`,`content`) values(?,?,?)";
        return update(sql,announcement.getPublisher(),announcement.getTime(),announcement.getContent());
    }

    @Override
    public List<Announcement> queryAnnouncements() {
        String sql = "select * from announcement";
        return queryForList(Announcement.class,sql);
    }

    @Override
    public int deleteAnnouncement(String time) {
        String sql = "delete from announcement where time = ?";
        return update(sql,time);
    }
}
