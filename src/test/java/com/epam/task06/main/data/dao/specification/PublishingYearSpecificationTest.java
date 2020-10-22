package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.data.dao.DaoException;
import com.epam.task06.main.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class PublishingYearSpecificationTest {

    private static final Book BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);

    private final PublishingYearSpecification specification = new PublishingYearSpecification();

    @Test
    public void testFieldValueMatchesShouldReturnTrueWhenBookFieldPublishingYearEqualsValue() throws DaoException {
        //when
        boolean actual = specification.fieldValueMatches(BOOK, 2015);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFieldValueMatchesShouldReturnFalseWhenBookFieldPublishingYearNotEqualsValue() throws DaoException {
        //when
        boolean actual = specification.fieldValueMatches(BOOK, 2025);
        //then
        Assert.assertFalse(actual);
    }

    @Test(expected = DaoException.class) //then
    public void testFieldValueMatchesShouldThrowExceptionWhenGetNullValue() throws DaoException {
        //when
        boolean actual = specification.fieldValueMatches(BOOK, null);
    }
}