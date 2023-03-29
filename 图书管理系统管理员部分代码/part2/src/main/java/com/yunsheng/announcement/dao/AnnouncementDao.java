package com.yunsheng.announcement.dao;

import com.yunsheng.announcement.model.Announcement;
import com.yunsheng.bookManage.model.Book;

import java.util.List;

public interface AnnouncementDao {

    public int addAnnouncement(Announcement announcement);

    public List<Announcement> queryAnnouncements();

    public int deleteAnnouncement(String time);

}
