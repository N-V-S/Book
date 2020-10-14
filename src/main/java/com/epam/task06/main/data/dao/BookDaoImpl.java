package com.epam.task06.main.data.dao;

import com.epam.task06.main.data.dao.comparator.ComparatorFactory;
import com.epam.task06.main.data.dao.specification.Specification;
import com.epam.task06.main.data.dao.specification.SpecificationFactory;
import com.epam.task06.main.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class BookDaoImpl implements BookDao {

    private final List<Book> books = new ArrayList<Book>();
    private final SpecificationFactory specificationFactory = new SpecificationFactory();
    private final ComparatorFactory comparatorFactory = new ComparatorFactory();

    public void add(Book book) throws DaoException {
        if (books.contains(book)) {
            throw new DaoException("The book is already in the list.");
        }
        books.add(book);
    }

    public void remove(Book book) throws DaoException {
        if (!books.contains(book)) {
            throw new DaoException("There is no such book in the repository.");
        }
        books.remove(book);
    }

    public <T> List<Book> findByTag(BookFields field, T value) {
        Specification specification = specificationFactory.create(field);
        return specification.find(books, value);
    }

    public List<Book> sortByTag(BookFields field) {
        List<Book> sortedBookList = new ArrayList<Book>();
        sortedBookList.addAll(books);

        Comparator comparator = comparatorFactory.create(field);
        Collections.sort(sortedBookList, comparator);

        return sortedBookList;
    }

    public int size() {
        return books.size();
    }
}
