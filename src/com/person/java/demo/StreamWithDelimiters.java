package com.person.java.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWithDelimiters {

	public static void main(String[] args) {
		List<Double> myList = new ArrayList<Double>();
		myList.add(1.0);
		myList.add(1.1);
		myList.add(1.2);
		Stream<Double> myStream = myList.stream();
		String output = myStream.map(Math::log).map(s->Double.toString(s)).collect(Collectors.joining(","));
		System.out.println(output);

	}

}
