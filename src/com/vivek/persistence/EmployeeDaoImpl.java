package com.vivek.persistence;

import com.vivek.beans.Employee;
import com.vivek.beans.Project;
import com.vivek.database.EmployeeDataSource;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee searchEmployeeById(int empid) {
		for (Employee e : EmployeeDataSource.getEmployeeList())
			if (e.getEmployeeId() == empid)
				return e;
		return null;
	}
	
	@Override
	public boolean isAlloted(int empid) {
		for (Project p : EmployeeDataSource.getHashMap().keySet()) {
			for (Employee e : EmployeeDataSource.getHashMap().get(p))
				if (e.getEmployeeId() == empid)
					return true;
		}
		return false;
	}
	@Override
	public boolean isAllotedSpecificProject(Employee emp,Project p) {
		return EmployeeDataSource.getHashMap().get(p).contains(emp);
	}
	@Override
	public void deAllotProject(Employee emp,Project p) {
		EmployeeDataSource.getHashMap().get(p).remove(emp);
	}
}
