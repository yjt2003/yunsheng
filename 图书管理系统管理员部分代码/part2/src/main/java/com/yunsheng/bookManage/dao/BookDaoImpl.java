package com.yunsheng.bookManage.dao;

import com.yunsheng.bookManage.model.Book;
import com.yunsheng.BaseDao;

import java.util.List;


public class BookDaoImpl extends BaseDao implements BookDao {
    @Override
    public int addBook(Book book) {
        String sql = "insert into book(name, author, introduction, number, restNumber)  values(?,?,?,?,?)";
        return update(sql,book.getName(),book.getAuthor(),book.getIntroduction(),book.getNumber(),book.getRestNumber());
    }

    @Override
    public int deleteBook(String name) {
        String sql = "delete from book where name = ?";

        return update(sql,name);
    }

    @Override
    public int updateBook(Book book) {
        String sql = "update book set author = ?,introduction=?,number=?,restNumber=? where name = ?";
        return update(sql,book.getAuthor(),book.getIntroduction(),book.getNumber(),book.getRestNumber(),book.getName());
    }
    @Override
    public List<Book> queryBooks() {
        String sql = "select * from book";
        return queryForList(Book.class,sql);
    }
}
