package com.person.java.demo;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {
public static void main(String args[]){
	Clock clock = Clock.systemUTC();
	System.out.println(Clock.systemDefaultZone());
	
	LocalDateTime dateAndTime = LocalDateTime.now(clock);
	System.out.println(dateAndTime);
	System.out.println(LocalDateTime.now());
	
	ZoneId zone = ZoneId.systemDefault();
	System.out.println(Clock.system(zone));
	System.out.println(Clock.system(ZoneId.of("Europe/Berlin")));
	
	LocalDate date = LocalDate.now();
	System.out.println(String.format("%s-%s-%s",  date.getYear(), date.getMonthValue(), date.getDayOfMonth()));
	
	LocalDate dateLater = LocalDate.of(2014, Month.APRIL, 5);
	Month bMonth = dateLater.getMonth();
	System.out.println(bMonth.getValue());
	
	Month firstMonthOfQuarter = bMonth.firstMonthOfQuarter();
	System.out.println(firstMonthOfQuarter.getValue());
}
}
