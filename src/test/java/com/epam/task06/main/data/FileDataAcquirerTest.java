package com.epam.task06.main.data;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class FileDataAcquirerTest {

    private static final String INPUT_FILE = "src/test/resources/input.txt";
    private final static String INVALID_FILE = "src/test/resources/invalid.txt";
    private static final String CHARACTER_ENCODING = "UTF-8";

    @Test
    public void testReadShouldReadFromFileWhenFileExists() throws DataException, IOException {
        //given
        FileDataReader reader = new FileDataReader(INPUT_FILE);
        List<String> expectedFilelines = FileUtils.readLines(new File(INPUT_FILE), CHARACTER_ENCODING);
        //when
        List<String> actualFileLines = reader.readLines();
        //then
        Assert.assertEquals(expectedFilelines, actualFileLines);
    }

    @Test(expected = DataException.class) //then
    public void testReadShouldThrowExceptionWhenFileNotExists() throws DataException {
        //given
        FileDataReader reader = new FileDataReader(INVALID_FILE);
        //when
        reader.readLines();
    }

}