package com.yunsheng.bookManage.service;

import com.yunsheng.bookManage.dao.BookDao;
import com.yunsheng.bookManage.dao.BookDaoImpl;
import com.yunsheng.bookManage.model.Book;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BookDao bookDao = new BookDaoImpl();

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int deleteBook(String name) {
        return bookDao.deleteBook(name);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public List<Book> queryBooks() {
        return bookDao.queryBooks();
    }
}
