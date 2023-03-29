package com.yunsheng.bookManage.dao;

import com.yunsheng.bookManage.model.Book;

import java.util.List;

public interface BookDao {

    public int addBook(Book book);

    public int deleteBook(String name);

    public int updateBook(Book book);

    public List<Book> queryBooks();


}
