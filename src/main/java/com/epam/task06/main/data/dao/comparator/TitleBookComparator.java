package com.epam.task06.main.data.dao.comparator;

import com.epam.task06.main.model.Book;

import java.util.Comparator;

public class TitleBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        String titleFirstBook = firstBook.getTitle();
        String titleSecondBook = secondBook.getTitle();

        if (titleFirstBook == null && titleSecondBook == null) {
            return 0;
        }
        if (titleFirstBook == null) {
            return -1;
        }
        if (titleSecondBook == null) {
            return 1;
        }
        return titleFirstBook.compareToIgnoreCase(titleSecondBook);
    }
}