package com.epam.task06.main.data;

public class DataException extends Exception {

    public DataException(String message, Exception e) {
        super(message, e);
    }
}
