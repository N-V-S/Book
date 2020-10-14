package com.epam.task06.main.data.dao;

import com.epam.task06.main.model.Book;
import com.epam.task06.main.model.BookFields;

import java.util.List;

public interface BookDao {

    void add(Book book) throws DaoException;

    void remove(Book book) throws DaoException;

    <T> List<Book> findByTag(BookFields field, T value);

    List<Book> sortByTag(BookFields field);

    int size();
}