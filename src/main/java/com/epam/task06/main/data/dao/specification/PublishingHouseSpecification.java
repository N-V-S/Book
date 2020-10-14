package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.model.Book;

public class PublishingHouseSpecification extends AbstractSpecification<String> {

    @Override
    public boolean fieldValueMatches(Book book, String value) {
        String publishingHouse = book.getPublishingHouse();
        return publishingHouse.equalsIgnoreCase(value);
    }
}