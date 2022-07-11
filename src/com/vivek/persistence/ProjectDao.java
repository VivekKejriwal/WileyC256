package com.vivek.persistence;

import com.vivek.beans.Employee;
import com.vivek.beans.Project;

public interface ProjectDao {
	Project searchProjectById(int pid);
	boolean isFull(int pid,int cap);
	void allotProject(Project p,Employee emp);
	void displayDetails();
}
