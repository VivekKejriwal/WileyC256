package com.vivek.service;

public interface EmployeeService {
	boolean searchProjectById(int pid);
	void allotProject(int pid,int empid);
	boolean searchEmployeeById(int empid);
	void deAllotProject(int pid,int empid);
	void changeProject(int curr_pid,int new_pid,int empid);
	void displayDetails();
}
