package com.person.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ReverseOrder {

	public static void main(String[] args) {
String[] strArrays = new String[3];
strArrays[0] = "1";
strArrays[1] = "2";
strArrays[2] = "3";

List list = new ArrayList(Arrays.asList(strArrays));
Comparator cmp = Collections.reverseOrder();  
Collections.sort(list, cmp);
System.out.println(list);
StringBuffer interned = new StringBuffer();
while(true){
	Random rnd= new Random();
	int length = rnd.nextInt(100);
	StringBuilder builder = new StringBuilder();
	String charrs = "abcdefghijklmnopqrstuvwxyz";
	for(int i=0;i<length;i++){
		builder.append(charrs.charAt(rnd.nextInt(charrs.length())));
	}
	interned.append(builder.toString().intern());
	System.out.println(builder.toString().intern());
}
	};

}

