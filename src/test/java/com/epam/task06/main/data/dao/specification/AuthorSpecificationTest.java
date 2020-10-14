package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class AuthorSpecificationTest {

    private static final Book BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);

    private final AuthorSpecification specification = new AuthorSpecification();

    @Test
    public void testFieldValueMatchesShouldReturnTrueWhenBookFieldAuthorEqualsValue() {
        //when
        boolean actual = specification.fieldValueMatches(BOOK, "Kathy Sierra");
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFieldValueMatchesShouldReturnFalseWhenBookFieldAuthorNotEqualsValue() {
        //when
        boolean actual = specification.fieldValueMatches(BOOK, "Bruce Eckel");
        //then
        Assert.assertFalse(actual);
    }
}