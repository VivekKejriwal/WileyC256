package com.vivek.persistence;

import com.vivek.beans.Employee;
import com.vivek.beans.Project;
import com.vivek.database.EmployeeDataSource;


public class ProjectDaoImpl implements ProjectDao {

	@Override
	public Project searchProjectById(int pid) {
		for (Project p : EmployeeDataSource.getProjectList())
			if (p.getProjectId() == pid)
				return p;
		return null;
	}

	@Override
	public boolean isFull(int pid, int cap) {
		return EmployeeDataSource.getHashMap().get(searchProjectById(pid)).size() == cap;
	}

	@Override
	public void allotProject(Project p, Employee emp) {
		EmployeeDataSource.getHashMap().get(p).add(emp);
	}
	@Override
	public void displayDetails() {
		for(Project p:EmployeeDataSource.getHashMap().keySet())
			System.out.println(p +" "+ EmployeeDataSource.getHashMap().get(p));
	}
}
