package javaassignment;

import java.time.LocalDate;

public class LocalDateExample {
	public static void main(String[]args) {
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow=yesterday.plusDays(2);
		System.out.println("Today date:"+date);
		System.out.println("Yesterday:"+yesterday);
		System.out.println("Tomorrow:"+tomorrow);
	}

}
