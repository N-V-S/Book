package com.epam.task06.main.data.dao.comparator;

import com.epam.task06.main.model.Book;

import java.util.Comparator;

public class PublishingHouseBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        String publishingHouseFirstBook = firstBook.getPublishingHouse();
        String publishingHouseSecondBook = secondBook.getPublishingHouse();

        if (publishingHouseFirstBook == null && publishingHouseSecondBook == null) {
            return 0;
        }
        if (publishingHouseFirstBook == null) {
            return -1;
        }
        if (publishingHouseSecondBook == null) {
            return 1;
        }
        return publishingHouseFirstBook.compareToIgnoreCase(publishingHouseSecondBook);
    }
}