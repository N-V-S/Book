package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.model.BookFields;

public class SpecificationFactory {

    public Specification create(BookFields field) {
        switch (field) {
            case TITLE:
                return new TitleSpecification();
            case AUTHOR:
                return new AuthorSpecification();
            case PUBLISHINGHOUSE:
                return new PublishingHouseSpecification();
            case PUBLISHINGYEAR:
                return new PublishingYearSpecification();
            default:
                throw new IllegalArgumentException("Unknown book's field: " + field);
        }
    }
}