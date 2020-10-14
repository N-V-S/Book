package com.epam.task06.main.data.dao.comparator;

import com.epam.task06.main.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class PublishingHouseBookComparatorTest {

    private static final Book FIRST_BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);
    private static final Book SECOND_BOOK = new Book("Thinking in Java", "Bruce Eckel", "Prentice Hall", 2006);
    private static final Book THIRD_BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);
    private static final Book PUBLISHING_HOUSE_BOOK_NULL = new Book("Head First Java", "Kathy Sierra", null, 2015);

    private final PublishingHouseBookComparator comparator = new PublishingHouseBookComparator();

    @Test
    public void testCompareShouldReturnNegativeNumberWhenPublishingHouseFirstBookIsNullAndPublishingHouseSecondBookIsNotNull() {
        //when
        int actual = comparator.compare(PUBLISHING_HOUSE_BOOK_NULL, FIRST_BOOK);
        //then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testCompareShouldReturnNegativeNumberWhenPublishingHouseFirstBookLessThanPublishingHouseSecondBook() {
        //when
        int actual = comparator.compare(FIRST_BOOK, SECOND_BOOK);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenPublishingHouseFirstAndSecondBooksAreNull() {
        //when
        int actual = comparator.compare(PUBLISHING_HOUSE_BOOK_NULL, PUBLISHING_HOUSE_BOOK_NULL);
        //then
        Assert.assertTrue(actual == 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenPublishingHouseFirstBookEqualsPublishingHouseSecondBook() {
        //when
        int actual = comparator.compare(FIRST_BOOK, THIRD_BOOK);
        //then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testCompareShouldReturnPositiveNumberWhenPublishingHouseFirstBookIsNotNullAndPublishingHouseSecondBookIsNull() {
        //when
        int actual = comparator.compare(FIRST_BOOK, PUBLISHING_HOUSE_BOOK_NULL);
        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testCompareShouldReturnPositiveNumberWhenPublishingHouseFirstBookMoreThanPublishingHouseSecondBook() {
        //when
        int actual = comparator.compare(SECOND_BOOK, FIRST_BOOK);
        //then
        Assert.assertTrue(actual > 0);
    }
}