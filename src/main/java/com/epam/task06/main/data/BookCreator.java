package com.epam.task06.main.data;

import com.epam.task06.main.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCreator {

    private final BookParser parser;

    public BookCreator(final BookParser parser) {
        this.parser = parser;
    }

    public List<Book> createBookList(List<String> lines) {
        List<Book> bookList = new ArrayList<Book>();
        for (String line : lines) {
            Book book = parser.parseStringIntoBook(line);
            bookList.add(book);
        }
        return bookList;
    }
}