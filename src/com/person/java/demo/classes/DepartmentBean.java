package com.person.java.demo.classes;

import java.util.Set;

import com.person.java.demo.interfaces.Department;
import com.person.java.demo.interfaces.Employee;
import com.person.java.demo.interfaces.Manager;

public class DepartmentBean implements Department {
private String name;
private Manager manager;
private Set<Employee> employees;
private String kindStr;
	@Override
	public Kind getKind() {
		// TODO Auto-generated method stub
		return Kind.valueOf(this.getKindStr());
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Manager getManager() {
		// TODO Auto-generated method stub
		return manager;
	}

	@Override
	public Set<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public String getKindStr() {
		return kindStr;
	}

	public void setKindStr(String kindStr) {
		this.kindStr = kindStr;
	}

	

}
