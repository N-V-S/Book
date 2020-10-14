package com.epam.task06.main.data.dao.comparator;

import com.epam.task06.main.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class TitleBookComparatorTest {

    private static final Book FIRST_BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);
    private static final Book SECOND_BOOK = new Book("Thinking in Java", "Bruce Eckel", "Prentice Hall", 2006);
    private static final Book THIRD_BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);
    private static final Book TITLE_BOOK_NULL = new Book(null, "Kathy Sierra", "Eksmo", 2015);

    private final TitleBookComparator comparator = new TitleBookComparator();

    @Test
    public void testCompareShouldReturnNegativeNumberWhenTitleFirstBookIsNullAndTitleSecondBookIsNotNull() {
        //when
        int actual = comparator.compare(TITLE_BOOK_NULL, FIRST_BOOK);
        //then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testCompareShouldReturnNegativeNumberWhenTitleFirstBookLessThanTitleSecondBook() {
        //when
        int actual = comparator.compare(FIRST_BOOK, SECOND_BOOK);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenTitleFirstAndSecondBooksAreNull() {
        //when
        int actual = comparator.compare(TITLE_BOOK_NULL, TITLE_BOOK_NULL);
        //then
        Assert.assertTrue(actual == 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenTitleFirstBookEqualsTitleSecondBook() {
        //when
        int actual = comparator.compare(FIRST_BOOK, THIRD_BOOK);
        //then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testCompareShouldReturnPositiveNumberWhenTitleFirstBookIsNotNullAndTitleSecondBookIsNull() {
        //when
        int actual = comparator.compare(FIRST_BOOK, TITLE_BOOK_NULL);
        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testCompareShouldReturnPositiveNumberWhenTitleFirstBookMoreThanTitleSecondBook() {
        //when
        int actual = comparator.compare(SECOND_BOOK, FIRST_BOOK);
        //then
        Assert.assertTrue(actual > 0);
    }
}