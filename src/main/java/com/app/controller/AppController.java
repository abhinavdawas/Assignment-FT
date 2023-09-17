package com.app.controller;

import com.app.DAO.UserDAOImpl;
import com.app.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.app.service.AppService;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class AppController {
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String insertData() throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserDAOImpl DAO = context.getBean("DAOBean", UserDAOImpl.class);
		AppService insertService = new AppService(DAO);
		insertService.insertDataToDB();
		return "Data Inserted";
	}

}


