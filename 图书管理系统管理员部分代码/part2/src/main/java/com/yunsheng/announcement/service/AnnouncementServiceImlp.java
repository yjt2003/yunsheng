package com.yunsheng.announcement.service;

import com.yunsheng.announcement.dao.AnnouncementDao;
import com.yunsheng.announcement.dao.AnnouncementDaoImpl;
import com.yunsheng.announcement.model.Announcement;

import java.util.List;

public class AnnouncementServiceImlp implements AnnouncementService{

    private AnnouncementDao announcementDao =new AnnouncementDaoImpl();

    @Override
    public int addAnnouncement(Announcement announcement) {
        return announcementDao.addAnnouncement(announcement);
    }

    @Override
    public List<Announcement> queryAnnouncements() {
        return announcementDao.queryAnnouncements();
    }

    @Override
    public int deleteAnnouncement(String time) {
        return announcementDao.deleteAnnouncement(time);
    }

}
