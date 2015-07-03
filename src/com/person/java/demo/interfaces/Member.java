package com.person.java.demo.interfaces;


public interface Member {
public Integer getAge();
public String getName();
public enum Gender{MALE, FEMALE};
public Gender getGender();
public Member getSpouse();
public String getCategoryType();
public void setSpouse(Member member);
}
