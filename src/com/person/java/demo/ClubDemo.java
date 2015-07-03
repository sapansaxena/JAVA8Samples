package com.person.java.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.person.java.demo.classes.ClubBean;
import com.person.java.demo.classes.MemberBean;
import com.person.java.demo.interfaces.Club;
import com.person.java.demo.interfaces.Member;

public class ClubDemo {
	 public static Predicate<Member> isSpouse = (a)->a.getSpouse() != null;

	public static void main(String[] args) {
		Member memberAmit, memberJaya;
 memberAmit = new MemberBean("Amit", 70, "MALE","Senior", null);
 memberJaya = new MemberBean("Jaya", 65, "FEMALE","Senior", memberAmit);
 memberAmit.setSpouse(memberJaya);
 Member memberChild = new MemberBean("TIger", 16, "MALE","Under 18", null);
 Member memberChild2 = new MemberBean("Tigeress", 17, "FEMALE","Under 18", null);
 Member memberAdult = new MemberBean("Abhi", 35, "MALE","Adult", null);
 Member memberAdult2 = new MemberBean("Aish", 37, "FEMALE","Adult", null);
 Member memberSenior = new MemberBean("Kishore", 80, "MALE","Senior", null);
 Set<Member> memberSet = new HashSet<Member>();
 memberSet.add(memberAmit);
 memberSet.add(memberJaya);
 memberSet.add(memberChild);
 memberSet.add(memberChild2);
 memberSet.add(memberAdult);
 memberSet.add(memberAdult2);
 memberSet.add(memberSenior);

 Club club = new ClubBean();
 club.setMembers(memberSet);
 
//Task 1
 String memberNameComma = memberSet.stream().map(Member :: getName).collect(Collectors.joining(","));
 System.out.println(memberNameComma);
 
 //Task 2
 Double averageAge = memberSet.stream().map(Member :: getAge).collect(Collectors.averagingInt((Integer x)->x));
 System.out.println(averageAge);
 
 //Task 3
 memberSet.stream().collect(Collectors.groupingBy(Member :: getGender)).
 forEach((g,lp) ->{  System.out.println(" Count of "+g+" is "+lp.stream().count());});
 
 memberSet.stream().collect(Collectors.groupingBy(Member ::getCategoryType)).forEach((g, lp)->System.out.println("Members of category "+ g+ " are"+lp.stream().map(Member ::getName).collect(Collectors.toList())));
 
	//Task 4
List<String> memberNames = memberSet.stream().filter(isSpouse).map(Member :: getName).collect(Collectors.toList());
	}

	
}
