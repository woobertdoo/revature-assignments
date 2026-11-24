package com.employeemanagement;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = -8165868336144852150L;

	private int empId;
	private String empName;
	private String department;
	private double salary;

	public Employee(int id, String name, String dept, double sal) {
		this.empId = id;
		this.empName = name;
		this.department = dept;
		this.salary = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", salary=" + salary
				+ "]";
	}
}
