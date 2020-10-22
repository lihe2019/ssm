package com.lihe.service;

import com.lihe.dao.BookMapper;
import com.lihe.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;


public class BookServiceImpl implements BookService {

    // service层调用dao层，组合Dao

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
