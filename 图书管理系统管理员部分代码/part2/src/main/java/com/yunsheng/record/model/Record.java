package com.yunsheng.record.model;

public class Record {

    private String bookName;

    private String borrower;

    private String borrowTime;

    private String howLong;//[7,15]

    private String returned;

    private String destroyed;

    private String compensated;

    public Record(){
    }

    public Record(String bookName, String borrower, String borrowTime, String howLong, String returned, String destroyed, String compensated) {
        this.bookName = bookName;
        this.borrower = borrower;
        this.borrowTime = borrowTime;
        this.howLong = howLong;
        this.returned = returned;
        this.destroyed = destroyed;
        this.compensated = compensated;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }

    public String getHowLong() {
        return howLong;
    }

    public void setHowLong(String howLong) {
        this.howLong = howLong;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    public String getDestroyed() {
        return destroyed;
    }

    public void setDestroyed(String destroyed) {
        this.destroyed = destroyed;
    }

    public String getCompensated() {
        return compensated;
    }

    public void setCompensated(String compensated) {
        this.compensated = compensated;
    }

    @Override
    public String toString() {
        return "Record{" +
                "bookName='" + bookName + '\'' +
                ", borrower='" + borrower + '\'' +
                ", borrowTime='" + borrowTime + '\'' +
                ", howLong='" + howLong + '\'' +
                ", returned='" + returned + '\'' +
                ", destroyed='" + destroyed + '\'' +
                ", compensated='" + compensated + '\'' +
                '}';
    }
}
