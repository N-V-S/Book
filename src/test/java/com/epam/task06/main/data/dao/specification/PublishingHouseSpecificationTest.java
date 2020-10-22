package com.epam.task06.main.data.dao.specification;

import com.epam.task06.main.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class PublishingHouseSpecificationTest {

    private static final Book BOOK = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);

    private final PublishingHouseSpecification specification = new PublishingHouseSpecification();

    @Test
    public void testFieldValueMatchesShouldReturnTrueWhenBookFieldPublishingHouseEqualsValue() {
        //when
        boolean actual = specification.fieldValueMatches(BOOK, "Eksmo");
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFieldValueMatchesShouldReturnFalseWhenBookFieldPublishingHouseNotEqualsValue() {
        //when
        boolean actual = specification.fieldValueMatches(BOOK, "Prentice Hall");
        //then
        Assert.assertFalse(actual);
    }

}
