package com.epam.task06.main.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class FileDataReader {

    private final static Logger LOGGER = Logger.getLogger(FileDataReader.class);

    private final String fileName;

    public FileDataReader(final String fileName) {
        this.fileName = fileName;
    }
    
    public List<String> readLines() throws DataException {
        BufferedReader reader = null;
        List<String> fileLines = new ArrayList<String>();
        try {
            reader = new BufferedReader(new java.io.FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
                fileLines.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage(), e);
                }
            }
        }
        return fileLines;
    }
}