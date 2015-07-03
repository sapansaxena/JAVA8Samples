package com.person.java.demo;

import com.person.java.demo.classes.ManagerBean;
import com.person.java.demo.interfaces.Person.Gender;

public class ImperativeToFunctional1 {
public static void main(String args[]){
	ManagerBean mg1 = new ManagerBean();
	mg1.setAge(55);mg1.setGender(Gender.MALE);mg1.setName("ABC");mg1.setSalary(10000);
}
}
