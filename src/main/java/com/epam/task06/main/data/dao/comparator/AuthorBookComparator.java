package com.epam.task06.main.data.dao.comparator;

import com.epam.task06.main.model.Book;

import java.util.Comparator;

public class AuthorBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        String authorFirstBook = firstBook.getAuthor();
        String authorSecondBook = secondBook.getAuthor();

        if (authorFirstBook == null && authorSecondBook != null) {
            return -1;
        }
        if (authorFirstBook == null && authorSecondBook == null) {
            return 0;
        }
        if (authorFirstBook != null && authorSecondBook == null) {
            return 1;
        }
        return authorFirstBook.compareToIgnoreCase(authorSecondBook);
    }
}