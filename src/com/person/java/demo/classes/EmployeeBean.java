package com.person.java.demo.classes;

import com.person.java.demo.interfaces.Employee;

public class EmployeeBean extends PersonBean implements Employee{
private long salary;
	@Override
	public long getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

}
