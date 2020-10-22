package com.lihe.dao;

import com.lihe.pojo.Books;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BookMapperImpl extends SqlSessionDaoSupport implements BookMapper{


    // 不用这个类了，用配置实现自动操作

    public int addBook(Books books) {
        return 0;
    }

    public int deleteBookById(int id) {
        return 0;
    }

    public int updateBook(Books books) {
        return 0;
    }

    public Books queryBookById(int id) {
        return null;
    }

    public List<Books> queryAllBook() {
        return null;
    }
}
