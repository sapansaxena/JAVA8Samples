package com.person.java.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerServiceImpl{
 public static void main(String args[]){
	 CustomerService custSer = new CustomerServiceI();
List<Service> serviceList = custSer.getServiceCatalog();
	List<Service> sortedList = serviceList.parallelStream().filter(t->t.getCategory().equals("Grocery")).
			sorted().collect(Collectors.toList());
	sortedList.forEach(e->System.out.println(e.getId()));
	serviceList.stream().collect(Collectors.groupingBy(Service::getCategory)).
	forEach((g,lp) ->{  System.out.println(" Max price of "+g+" is "+ lp.stream()
			.mapToInt(p-> p.getPrice()).max());});

	Double average = serviceList.stream().mapToDouble(t->t.getPrice()).average().getAsDouble();
	System.out.println(average);
 }


}
