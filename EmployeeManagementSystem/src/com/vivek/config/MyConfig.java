package com.vivek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vivek.persistence.EmployeeDao;
import com.vivek.persistence.EmployeeDaoImpl;
import com.vivek.persistence.ProjectDao;
import com.vivek.persistence.ProjectDaoImpl;
import com.vivek.presentation.EmployeePresentation;
import com.vivek.presentation.EmployeePresentationImpl;
import com.vivek.service.EmployeeService;
import com.vivek.service.EmployeeServiceImpl;

@Configuration
public class MyConfig {

	@Bean
	public EmployeePresentation getEmployeePresentation() {
		return new EmployeePresentationImpl(getEmployeeService());
	}
	@Bean
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl(getProjectDao(), getEmployeeDao());
	}
	@Bean
	public EmployeeDao getEmployeeDao() {
		return new EmployeeDaoImpl();
	}
	@Bean
	public ProjectDao getProjectDao() {
		return new ProjectDaoImpl();
	}
	
}
