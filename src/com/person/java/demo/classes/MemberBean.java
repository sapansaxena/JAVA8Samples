package com.person.java.demo.classes;

import java.time.LocalDate;

import com.person.java.demo.interfaces.Member;

public class MemberBean implements Member {
private String name;
private Integer age;
private String genderName;
private Member spouse;
private String categoryType;
private LocalDate dateOfJoining;
public MemberBean(){
	
}
public MemberBean(String name, Integer age, String genderName,String categoryType,  Member spouse){
	this.name=name;
	this.age=age;
	this.genderName=genderName;
	this.spouse=spouse;
	this.categoryType = categoryType;
}
@Override
public Integer getAge() {
	// TODO Auto-generated method stub
	return age;
}
@Override
public String getName() {
	// TODO Auto-generated method stub
	return name;
}
@Override
public Gender getGender() {
	// TODO Auto-generated method stub
	return Gender.valueOf(this.getGenderName());
}
public String getGenderName() {
	return genderName;
}
public void setGenderName(String genderName) {
	this.genderName = genderName;
}
public void setName(String name) {
	this.name = name;
}
public void setAge(Integer age) {
	this.age = age;
}
public Member getSpouse() {
	return spouse;
}
public void setSpouse(Member spouse) {
	this.spouse = spouse;
}
public String getCategoryType() {
	return categoryType;
}
public void setCategoryType(String categoryType) {
	this.categoryType = categoryType;
}
public LocalDate getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(LocalDate dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}

}
