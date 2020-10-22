package com.epam.task06.main.data;

import com.epam.task06.main.model.Book;

public class BookParser {

    public static final String FIELDS_SEPARATOR = "_";

    public static final int TITLE_INDEX = 0;
    public static final int AUTHOR_INDEX = 1;
    public static final int PUBLISHING_HOUSE_INDEX = 2;
    public static final int PUBLISHING_YEAR_INDEX = 3;

    public Book parseStringIntoBook(String line) {
        String[] bookFields = line.split(FIELDS_SEPARATOR);
        String title = bookFields[TITLE_INDEX];
        String author = bookFields[AUTHOR_INDEX];
        String publishingHouse = bookFields[PUBLISHING_HOUSE_INDEX];
        int publishingYear = Integer.parseInt(bookFields[PUBLISHING_YEAR_INDEX]);
        return new Book(title, author, publishingHouse, publishingYear);
    }
}