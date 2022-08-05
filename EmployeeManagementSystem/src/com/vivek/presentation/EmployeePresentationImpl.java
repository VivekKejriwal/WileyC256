package com.vivek.presentation;

import java.util.Scanner;

import com.vivek.service.EmployeeService;
import com.vivek.service.EmployeeServiceImpl;
public class EmployeePresentationImpl implements EmployeePresentation {
	private EmployeeService employeeService;
	
	public EmployeePresentationImpl(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	Scanner scanner = new Scanner(System.in);
	@Override
	public void showMenu() {
		System.out.println("1. Assign a project to employee.");
		System.out.println("2. Unassign a project from the employee.");
		System.out.println("3. Change project of an employee.");
		System.out.println("4. Check all projects and employee status");
		System.out.println("5. Exit from the system");
		
	}

	@Override
	public void performMenu(int c) {
		switch(c) {
		case 1:
			System.out.println("Enter the Project Id for employee allotment");
			int pid = scanner.nextInt();
			System.out.println("Enter the Employee Id for employee allotment");
			int empId = scanner.nextInt();
			employeeService.allotProject(pid,empId);
			break;
		case 2:
			System.out.println("Enter the Project Id for employee removal");
			int pid1 = scanner.nextInt();
			System.out.println("Enter the Employee Id to be removed");
			int empId1 = scanner.nextInt();
			employeeService.deAllotProject(pid1,empId1);
			break;
		case 3:
			System.out.println("Enter the Current Project Id for employee removal");
			int curr_pid = scanner.nextInt();
			System.out.println("Enter the New Project Id for employee allotment");
			int new_pid = scanner.nextInt();
			System.out.println("Enter the Employee Id to be removed");
			int empId2 = scanner.nextInt();
			employeeService.changeProject(curr_pid,new_pid,empId2);
			break;
		case 4:
			employeeService.displayDetails();
			break;
		case 5:
			System.out.println("Thank you for using Project Management System");
			System.exit(0);
		}
	}
}
