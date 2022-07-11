package com.vivek.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	private String empName;
	private int employeeId;
	private String designation;
	private String department;
	private int salary;
}
