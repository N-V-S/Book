package com.epam.task06.main.data;

import com.epam.task06.main.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookParcerTest {

    @Test
    public void testParseShouldReturnBookWhenGetLine() throws DataException {
        //given
        BookParser bookParser = new BookParser();
        String fileLine = "Head First Java_Kathy Sierra_Eksmo_2015";
        Book expectedBook = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);
        //when
        Book actualBook = bookParser.parseStringIntoBook(fileLine);
        //then
        Assert.assertEquals(expectedBook, actualBook);
    }
}