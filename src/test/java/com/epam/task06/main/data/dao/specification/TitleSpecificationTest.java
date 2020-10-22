package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class TitleSpecificationTest {

    private static final Book BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);

    private final TitleSpecification specification = new TitleSpecification();

    @Test
    public void testFieldValueMatchesShouldReturnTrueWhenBookFieldPublishingYearEqualsValue() {
        //when
        boolean actual = specification.fieldValueMatches(BOOK, "Head First Java");
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFieldValueMatchesShouldReturnFalseWhenBookFieldPublishingYearNotEqualsValue() {
        //when
        boolean actual = specification.fieldValueMatches(BOOK, "Effective Java");
        //then
        Assert.assertFalse(actual);
    }
}