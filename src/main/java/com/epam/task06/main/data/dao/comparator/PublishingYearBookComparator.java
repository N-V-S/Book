package com.epam.task06.main.data.dao.comparator;

import com.epam.task06.main.model.Book;

import java.util.Comparator;

public class PublishingYearBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {
        int publishingYearBookOne = bookOne.getPublishingYear();
        int publishingYearBookTwo = bookTwo.getPublishingYear();

        return Integer.compare(publishingYearBookOne, publishingYearBookTwo);
    }
}