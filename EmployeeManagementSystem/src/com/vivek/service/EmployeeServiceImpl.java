package com.vivek.service;

import com.vivek.persistence.EmployeeDao;
import com.vivek.persistence.EmployeeDaoImpl;
import com.vivek.persistence.ProjectDao;
import com.vivek.persistence.ProjectDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private ProjectDao projectDao ;
	private EmployeeDao employeeDao;
	
	

	public EmployeeServiceImpl(ProjectDao projectDao, EmployeeDao employeeDao) {
		super();
		this.projectDao = projectDao;
		this.employeeDao = employeeDao;
	}

	@Override
	public boolean searchProjectById(int pid) {
		return projectDao.searchProjectById(pid) != null;
	}

	@Override
	public boolean searchEmployeeById(int empid) {
		return employeeDao.searchEmployeeById(empid) != null;
	}

	@Override
	public void allotProject(int pid, int empid) {
		if (!searchEmployeeById(empid)) {
			System.out.println("Employee Id doesn't exist");
			return;
		}
		if (!searchProjectById(pid)) {
			System.out.println("Project Id doesn't exist");
			return;
		}
		if (employeeDao.isAlloted(empid)) {
			System.out.println("Employee is busy in a different project");
			return;
		}
		if (projectDao.isFull(pid, 10)) {
			System.out.println("Project is already full.");
			return;
		}
		projectDao.allotProject(projectDao.searchProjectById(pid), employeeDao.searchEmployeeById(empid));
		System.out.println("Employee alloted for the project successfully");
	}
	@Override
	public void deAllotProject(int pid,int empid) {
		if (!searchEmployeeById(empid)) {
			System.out.println("Employee Id doesn't exist");
			return;
		}
		if (!searchProjectById(pid)) {
			System.out.println("Project Id doesn't exist");
			return;
		}
		if(!employeeDao.isAllotedSpecificProject(employeeDao.searchEmployeeById(empid),projectDao.searchProjectById(pid))) {
			System.out.println("Employee is not working in this Project");
			return;
		}
		employeeDao.deAllotProject(employeeDao.searchEmployeeById(empid),projectDao.searchProjectById(pid));
		System.out.println("Employee successfully remove from the project");
	}
	@Override
	public void changeProject(int curr_pid,int new_pid,int empid) {
		if (!searchEmployeeById(empid)) {
			System.out.println("Employee Id doesn't exist");
			return;
		}
		if (!searchProjectById(curr_pid)) {
			System.out.println("Current Project Id doesn't exist");
			return;
		}
		if (!searchProjectById(new_pid)) {
			System.out.println("New Project Id doesn't exist");
			return;
		}
		if(!employeeDao.isAllotedSpecificProject(employeeDao.searchEmployeeById(empid),projectDao.searchProjectById(curr_pid))) {
			System.out.println("Employee is not working in this Project");
			return;
		}
		if (projectDao.isFull(new_pid, 10)) {
			System.out.println("New Project is already full.");
			return;
		}
		employeeDao.deAllotProject(employeeDao.searchEmployeeById(empid),projectDao.searchProjectById(curr_pid));
		projectDao.allotProject(projectDao.searchProjectById(new_pid), employeeDao.searchEmployeeById(empid));
		System.out.println("Employee Project changed Successfully");

	}
	@Override
	public void displayDetails() {
		projectDao.displayDetails();
	}
}
