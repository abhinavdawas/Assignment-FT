package com.app.config;

import com.app.DAO.UserDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/users?allowPublicKeyRetrieval=true&useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("abhi@1234");
		return dataSource;
	}
	@Bean(name="DAOBean")
	public UserDAOImpl UserDAO(){
		return new UserDAOImpl(getDataSource());
	}
}








