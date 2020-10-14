package com.epam.task06.main.model;

import java.util.Objects;

public final class Book {

    private final String title;
    private final String author;
    private final String publishingHouse;
    private final int publishingYear;

    public Book(String title, String author, String publishingHouse, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                publishingHouse.equals(book.publishingHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingHouse, publishingYear);
    }

    @Override
    public String toString() {
        return String.format("Book{title=%s, author=%s, publishingHouse=%s, publishingYear=%d}",
                title, author, publishingHouse, publishingYear);
    }
}
