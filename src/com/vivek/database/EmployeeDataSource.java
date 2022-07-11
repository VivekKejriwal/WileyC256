package com.vivek.database;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.vivek.beans.Employee;
import com.vivek.beans.Project;

public class EmployeeDataSource {

	private static Set<Employee> employeeList = new HashSet<>();
	private static Set<Project> projectList = new HashSet<>();
	private static HashMap<Project, HashSet<Employee>> hashMap = new HashMap<>();

	static {
		employeeList.add(new Employee("AA", 101, "Manager", "IT", 20000));
		employeeList.add(new Employee("BB", 102, "Assistant Manager", "IT", 15000));
		employeeList.add(new Employee("AA", 103, "Developer", "IT", 10000));
		employeeList.add(new Employee("AA", 104, "Tester", "IT", 5000));

		projectList.add(new Project("Java", 201));
		projectList.add(new Project("Python", 202));

		hashMap.put(new Project("Java", 201), new HashSet<Employee>());
		hashMap.put(new Project("Python", 202), new HashSet<Employee>());
	}

	public static Set<Employee> getEmployeeList() {
		return employeeList;
	}

	public static Set<Project> getProjectList() {
		return projectList;
	}

	public static HashMap<Project, HashSet<Employee>> getHashMap() {
		return hashMap;
	}
}
