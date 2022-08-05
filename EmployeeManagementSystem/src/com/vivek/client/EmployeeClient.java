package com.vivek.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.vivek.config.MyConfig;
import com.vivek.presentation.EmployeePresentation;

public class EmployeeClient {
	

	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("layered.xml");
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeePresentation employeePresentation = (EmployeePresentation)annotationConfigApplicationContext.getBean("getEmployeePresentation");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			employeePresentation.showMenu();
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			employeePresentation.performMenu(choice);

		}
	}
}
