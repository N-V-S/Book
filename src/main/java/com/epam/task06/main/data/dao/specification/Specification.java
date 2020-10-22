package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.data.dao.DaoException;
import com.epam.task06.main.model.Book;

import java.util.List;

public interface Specification<T> {

    List<Book> find(List<Book> books, T value) throws DaoException;
}