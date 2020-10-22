package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.model.Book;

public class AuthorSpecification extends AbstractSpecification<String> {

    @Override
    public boolean fieldValueMatches(Book book, String value) {
        String author = book.getAuthor();
        return author.equalsIgnoreCase(value);
    }
}