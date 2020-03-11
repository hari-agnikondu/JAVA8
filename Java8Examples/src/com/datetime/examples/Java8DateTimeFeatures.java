package com.datetime.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Java8DateTimeFeatures {
	
	public static void main(String []args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("LocalDate : " +date);
		
		
		
		LocalTime time = LocalTime.now();
		System.out.println("Local Time : " +time);
		
		
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("LocalDate : " +dateTime);
		
		
		
		ZonedDateTime zdateTime = ZonedDateTime.now();
		System.out.println("Zoned Date Time : "+zdateTime);
		
		
		LocalDate from = LocalDate.now();
		LocalDate to = from.plusWeeks(10);

		long result = ChronoUnit.DAYS.between(from, to);
		System.out.println("Difference between the From and To date is : "+result +" days");
	}

}
