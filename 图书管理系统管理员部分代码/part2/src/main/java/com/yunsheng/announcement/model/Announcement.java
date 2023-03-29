package com.yunsheng.announcement.model;

public class Announcement {

    private String publisher;

    private String time;

    private String content;

    public Announcement(){
    }

    public Announcement(String publisher, String time, String content) {
        this.publisher = publisher;
        this.time = time;
        this.content = content;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "publisher='" + publisher + '\'' +
                ", time='" + time + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
