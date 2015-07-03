package com.person.java.demo.interfaces;

import java.util.Set;

public interface Department {
public enum Kind{SALES, DEVELOPMENT, ACCOUNTING, HUMAN_RESOURCES}
public Department.Kind getKind();
public String getName();
public Manager getManager();
public Set<Employee> getEmployees();

}
