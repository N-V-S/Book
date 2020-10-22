package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.data.dao.DaoException;
import com.epam.task06.main.model.Book;

public class PublishingYearSpecification extends AbstractSpecification<Integer> {

    @Override
    public boolean fieldValueMatches(Book book, Integer value) throws DaoException {
        if (value == null) {
            throw new DaoException("Null value passed to specification.");
        }
        return book.getPublishingYear() == value;
    }
}