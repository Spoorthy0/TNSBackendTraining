package com.tnsif.lambdademo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateTimeExample {

	public static void main(String[] args) {
		    LocalDate date = LocalDate.now();              // Current date
	        LocalTime time = LocalTime.now();              // Current time
	        LocalDateTime dateTime = LocalDateTime.now();  // Current date and time
	        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // With time zone

	        System.out.println("Date: " + date);
	        System.out.println("Time: " + time);
	        System.out.println("DateTime: " + dateTime);
	        System.out.println("ZonedDateTime: " + zonedDateTime);

	}

}
