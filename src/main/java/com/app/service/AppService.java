package com.app.service;

import com.app.DAO.UserDAOImpl;
import com.app.model.User;
import com.app.utils.UserCsvReader;

import java.io.IOException;
import java.util.List;
public class AppService {
    public AppService(UserDAOImpl userDAO) throws IOException {
        this.userDAO = userDAO;
    }
    UserDAOImpl userDAO;
    public void insertDataToDB() throws IOException {

        UserCsvReader parser = new UserCsvReader();

        List<User> listOfUsers = parser.readCsvToUser();

        userDAO.addUser(listOfUsers.get(0));

        System.out.println("Hello world!");
    }
}
