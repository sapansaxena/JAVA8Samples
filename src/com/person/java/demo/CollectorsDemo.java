package com.person.java.demo;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {
public static void main(String args[]){
	Integer[] numbersArray = new Integer[]{1,2,3,4,5};
	System.out.println(Arrays.stream(numbersArray).collect(Collectors.counting()));
	System.out.println(Arrays.stream(numbersArray).collect(Collectors.summingInt((Integer x)->x)));
	System.out.println(Arrays.stream(numbersArray).collect(Collectors.minBy(Integer::compare)).get());
	System.out.println(Arrays.stream(numbersArray).collect(Collectors.averagingInt((Integer x)->x)));
	System.out.println(Arrays.stream(numbersArray).collect(Collectors.maxBy(Integer::compare)).get());
	System.out.println(Arrays.stream(numbersArray).collect(Collectors.summarizingInt((Integer x)->x)));


}
}
