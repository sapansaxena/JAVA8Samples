package com.person.java.demo.classes;

import com.person.java.demo.interfaces.Person;

public class PersonBean implements Person {

	private int age;
	private String name;
	private Gender gender;
	
	
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Gender getGender() {
		// TODO Auto-generated method stub
		return gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
