package com.epam.task06.main.data.dao;

import com.epam.task06.main.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookDaoTest {

    private static final Book FIRST_BOOK_TO_ADD = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);
    private static final Book SECOND_BOOK_TO_ADD = new Book("Thinking in Java", "Bruce Eckel", "Prentice Hall", 2006);
    private static final Book BOOK_TO_REMOVE = new Book("Head First Java", "Kathy Sierra", "Eksmo", 2015);

    @Test
    public void testAddBookShouldAddBookWhenGetBook() throws DaoException {
        //given
        BookDaoImpl bookDao = new BookDaoImpl();
        int startSize = bookDao.size();
        //when
        bookDao.add(FIRST_BOOK_TO_ADD);
        //then
        int endSize = bookDao.size();
        Assert.assertTrue(startSize < endSize);
    }

    @Test(expected = DaoException.class) //then
    public void testAddBookShouldThrewExceptionWhenBookListContainsBookToAdd() throws DaoException {
        //given
        BookDaoImpl bookDao = new BookDaoImpl();
        bookDao.add(FIRST_BOOK_TO_ADD);
        //when
        bookDao.add(FIRST_BOOK_TO_ADD);
    }

    @Test
    public void testRemoveBookShouldRemoveBookWhenBookIsInTheList() throws DaoException {
        //given
        BookDaoImpl bookDao = new BookDaoImpl();
        bookDao.add(FIRST_BOOK_TO_ADD);
        int startSize = bookDao.size();
        //when
        bookDao.remove(BOOK_TO_REMOVE);
        //then
        int endSize = bookDao.size();
        Assert.assertTrue(startSize > endSize);
    }

    @Test(expected = DaoException.class) //then
    public void testRemoveShouldThrewExceptionWhenBookListIsNotContainsBookToRemove() throws DaoException {
        //given
        BookDaoImpl bookDao = new BookDaoImpl();
        bookDao.add(FIRST_BOOK_TO_ADD);
        //when
        bookDao.remove(SECOND_BOOK_TO_ADD);
    }
}