package com.yunsheng.userManage.model;

public class User {

    private String account;

    private String password;

    private String name;

    private String stuID;

    private String email;

    private String bookForReturn;

    private int status;

    public User(){
    }

    public User(String account, String password, String name, String stuID, String email, String bookForReturn, int status) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.stuID = stuID;
        this.email = email;
        this.bookForReturn = bookForReturn;
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBookForReturn() {
        return bookForReturn;
    }

    public void setBookForReturn(String bookForReturn) {
        this.bookForReturn = bookForReturn;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", stuID='" + stuID + '\'' +
                ", email='" + email + '\'' +
                ", bookForReturn='" + bookForReturn + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
