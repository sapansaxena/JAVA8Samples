package com.person.java.demo;

public class Service implements Comparable{
private int id;
private String category;
private String name;
private int price;
public Service(){
	
}
public Service(int id, String category, String name, int price){
	this.id = id;
	this.category = category;
	this.name=name;
	this.price=price;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public int compareTo(Object ser) {
	Service serviceObj = (Service)ser;
	if(this.getId()>serviceObj.getId())
	return 1;
	else if(this.getId()<serviceObj.getId())
	return -1;
	else return 0;
}

}
