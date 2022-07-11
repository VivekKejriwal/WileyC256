package com.vivek.persistence;

import com.vivek.beans.Employee;
import com.vivek.beans.Project;

public interface EmployeeDao {
	Employee searchEmployeeById(int empId);
	boolean isAlloted(int empId);
	boolean isAllotedSpecificProject(Employee emp,Project project);
	void deAllotProject(Employee emp,Project project);
}
