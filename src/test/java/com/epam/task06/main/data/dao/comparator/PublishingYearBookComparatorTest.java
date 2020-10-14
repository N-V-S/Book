package com.epam.task06.main.data.dao.comparator;

import com.epam.task06.main.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class PublishingYearBookComparatorTest {

    private static final Book FIRST_BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);
    private static final Book SECOND_BOOK = new Book("Thinking in Java", "Bruce Eckel", "Prentice Hall", 2006);
    private static final Book THIRD_BOOK = new Book("Effective Java", "Bloch", "Prentice Hall", 2015);

    private final PublishingYearBookComparator comparator = new PublishingYearBookComparator();

    @Test
    public void testCompareShouldReturnNegativeNumberWhenYearFirstBookLessThanYearSecondBook() {
        //when
        int actual = comparator.compare(SECOND_BOOK, FIRST_BOOK);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenPublishingYearFirstBookEqualsPublishingYearSecondBook() {
        //when
        int actual = comparator.compare(FIRST_BOOK, THIRD_BOOK);
        //then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testCompareShouldReturnPositiveNumberWhenPublishingYearFirstBookMoreThanPublishingYearSecondBook() {
        //when
        int actual = comparator.compare(FIRST_BOOK, SECOND_BOOK);
        //then
        Assert.assertTrue(actual > 0);
    }
}