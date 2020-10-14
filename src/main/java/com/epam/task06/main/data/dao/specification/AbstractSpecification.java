package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.model.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSpecification<T> implements Specification<T> {

    public abstract boolean fieldValueMatches(Book book, T value);

    @Override
    public List<Book> find(List<Book> bookList, T value) {
        List<Book> foundBooks = new ArrayList<Book>();
        for (Book book : bookList) {
            if (fieldValueMatches(book, value)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}