package com.person.java.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToListConst {
	public static void main(String args[]){
		List<Double> myList = new ArrayList<Double>();
		myList.add(1.0);
		myList.add(1.1);
		myList.add(1.2);
		myList.add(1.3);
		myList.add(1.4);
		Stream<Double> myStream = myList.stream();
		List listOfDoubles  = myStream.collect(Collectors.toCollection(LinkedList<Double>::new));
		System.out.println(listOfDoubles);
	}		
}
