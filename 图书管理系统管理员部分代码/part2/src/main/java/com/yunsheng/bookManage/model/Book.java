package com.yunsheng.bookManage.model;

public class Book {

    private String name;
    
    private String author;
    private String introduction;
    private Integer number;
    private Integer restNumber;

    public Book(){
    }

    public Book(String name, String author, String introduction, Integer number, Integer restNumber) {
        this.name = name;
        this.author = author;
        this.introduction = introduction;
        this.number = number;
        this.restNumber = restNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getRestNumber() {
        return restNumber;
    }

    public void setRestNumber(Integer restNumber) {
        this.restNumber = restNumber;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", introduction='" + introduction + '\'' +
                ", number=" + number +
                ", restNumber=" + restNumber +
                '}';
    }
}
