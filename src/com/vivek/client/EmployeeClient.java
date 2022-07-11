package com.vivek.client;

import java.util.Scanner;
import com.vivek.presentation.EmployeePresentation;
import com.vivek.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		EmployeePresentation employeePresentation = new EmployeePresentationImpl();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			employeePresentation.showMenu();
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			employeePresentation.performMenu(choice);

		}
	}
}
