package com.epam.task06.main.data;

import java.util.List;

public interface DataReader {

    List<String> readLines() throws DataException;
}
