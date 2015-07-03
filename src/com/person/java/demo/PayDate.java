package com.person.java.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.person.java.demo.classes.MemberBean;

public class PayDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate dateOfHiring = LocalDate.of(2015, Month.MAY, 5);
		LocalDate dateOfHiring2 = LocalDate.of(2014, Month.FEBRUARY, 6);
		LocalDate dateOfHiring3= LocalDate.of(2015, Month.JANUARY, 2);
		LocalDate dateOfHiring4 = LocalDate.of(2014, Month.AUGUST, 10);
		MemberBean member = new MemberBean();
		member.setDateOfJoining(dateOfHiring);
		member.setName("Ram");
		MemberBean member2 = new MemberBean();
		member2.setDateOfJoining(dateOfHiring2);
		member2.setName("Raghu");
		MemberBean member3 = new MemberBean();
		member3.setDateOfJoining(dateOfHiring3);
		member3.setName("Raunak");
		MemberBean member4 = new MemberBean();
		member4.setDateOfJoining(dateOfHiring4);
		member4.setName("Rakesh");
		List<MemberBean> memberList = new ArrayList<MemberBean>();
		memberList.add(member);
		memberList.add(member2);
		memberList.add(member3);
		memberList.add(member4);
		calculateWage(today, memberList);

	}
	private static void calculateWage(LocalDate end , List<MemberBean> memberList){
		//Period passedPeriod = Period.between(today, dateOfHiring);
		//memberList.stream().forEach(arg0);
		List<DayOfWeek> ignoreList = new ArrayList<DayOfWeek>();
		ignoreList.add(DayOfWeek.SATURDAY);
		ignoreList.add(DayOfWeek.SUNDAY);
		
		LocalDate start =  LocalDate.of(2015, Month.JANUARY, 2);
		memberList.stream().map(MemberBean::getDateOfJoining).forEach(startDate->System.out.println(
		Stream.iterate(startDate, d->d.plusDays(1))
        .limit(startDate.until(end, ChronoUnit.DAYS))
        .filter(d->!ignoreList.contains(d.getDayOfWeek()))
        .count()));
		//System.out.println(workingDays);
}
}
