package com.epam.task06.main.data.dao.comparator;

import com.epam.task06.main.model.Book;
import com.epam.task06.main.model.BookFields;

import java.util.Comparator;

public class ComparatorFactory {

    public Comparator<Book> create(BookFields field) {
        switch (field){
            case TITLE:
                return new TitleBookComparator();
            case AUTHOR:
                return new AuthorBookComparator();
            case PUBLISHINGHOUSE:
                return new PublishingHouseBookComparator();
            case PUBLISHINGYEAR:
                return new PublishingYearBookComparator();
            default:
                throw new IllegalArgumentException("Unknown book's field: " + field);
        }
    }
}