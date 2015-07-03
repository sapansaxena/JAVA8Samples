package com.person.java.demo.classes;

import java.util.Set;

import com.person.java.demo.interfaces.Corporation;
import com.person.java.demo.interfaces.Department;

public class CorporationBean implements Corporation {
private Set<Department> departments;

	@Override
	public Set<Department> getDepartments() {
		// TODO Auto-generated method stub
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

}
