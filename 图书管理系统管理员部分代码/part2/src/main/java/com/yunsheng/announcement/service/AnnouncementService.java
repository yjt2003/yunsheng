package com.yunsheng.announcement.service;

import com.yunsheng.announcement.model.Announcement;
import com.yunsheng.bookManage.model.Book;

import java.util.List;

public interface AnnouncementService {

    public int addAnnouncement(Announcement announcement);

    public List<Announcement> queryAnnouncements();

    public int deleteAnnouncement(String time);
}
