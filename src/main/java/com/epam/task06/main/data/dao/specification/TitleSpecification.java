package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.model.Book;

public class TitleSpecification extends AbstractSpecification<String> {

    @Override
    public boolean fieldValueMatches(Book book, String value) {
        String title = book.getTitle();
        return title.equalsIgnoreCase(value);
    }
}