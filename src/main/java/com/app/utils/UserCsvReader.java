package com.app.utils;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.app.model.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserCsvReader {

    public List<User> readCsvToUser() throws IOException {

        // set correct path to csv file on your disc
        File csvFile = new File("/Users/abhishekdawas/Documents/S21L08-Project-files (1)/Assignment-FT/src/main/resources/sampleDataTest.csv");

        CsvMapper csvMapper = new CsvMapper();

        CsvSchema csvSchema = csvMapper
                .typedSchemaFor(User.class)
                .withHeader()
                .withColumnSeparator(',')
                .withComments();

        MappingIterator<User> complexUsersIter = csvMapper
                .readerWithTypedSchemaFor(User.class)
                .with(csvSchema)
                .readValues(csvFile);

        List<User> listUsers = complexUsersIter.readAll();
        return listUsers;
    }

    public UserCsvReader() throws IOException {
    }

}