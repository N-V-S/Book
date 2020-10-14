package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.model.Book;

public class PublishingYearSpecification extends AbstractSpecification<Integer> {

    @Override
    public boolean fieldValueMatches(Book book, Integer value) {

        return book.getPublishingYear() == value;
    }
}