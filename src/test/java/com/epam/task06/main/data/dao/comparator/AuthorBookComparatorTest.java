package com.epam.task06.main.data.dao.comparator;

import com.epam.task06.main.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class AuthorBookComparatorTest {

    private static final Book FIRST_BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);
    private static final Book SECOND_BOOK = new Book("Thinking in Java", "Bruce Eckel", "Prentice Hall", 2006);
    private static final Book THIRD_BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);
    private static final Book AUTHOR_BOOK_NULL = new Book("Head First Java", null, "Eksmo", 2015);

    private final AuthorBookComparator comparator = new AuthorBookComparator();

    @Test
    public void testCompareShouldReturnNegativeNumberWhenAuthorFirstBookIsNullAndAuthorSecondBookIsNotNull() {
        //when
        int actual = comparator.compare(AUTHOR_BOOK_NULL, FIRST_BOOK);
        //then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testCompareShouldReturnNegativeNumberWhenAuthorFirstBookLessThanAuthorSecondBook() {
        //when
        int actual = comparator.compare(SECOND_BOOK, FIRST_BOOK);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenAuthorFirstAndSecondBooksAreNull() {
        //when
        int actual = comparator.compare(AUTHOR_BOOK_NULL, AUTHOR_BOOK_NULL);
        //then
        Assert.assertTrue(actual == 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenAuthorFirstBookEqualsAuthorSecondBook() {
        //when
        int actual = comparator.compare(FIRST_BOOK, THIRD_BOOK);
        //then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testCompareShouldReturnPositiveNumberWhenAuthorFirstBookIsNotNullAndAuthorSecondBookIsNull() {
        //when
        int actual = comparator.compare(FIRST_BOOK, AUTHOR_BOOK_NULL);
        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testCompareShouldReturnPositiveNumberWhenAuthorFirstBookMoreThanAuthorSecondBook() {
        //when
        int actual = comparator.compare(FIRST_BOOK, SECOND_BOOK);
        //then
        Assert.assertTrue(actual > 0);
    }
}