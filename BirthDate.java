package javaassignment;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
 class Cal {
	int day,month,year;
	Calendar c;
	public Cal (Calendar c) {
		day=c.get(Calendar.DAY_OF_MONTH);
		month=c.get(Calendar.MONTH);
		year=c.get(Calendar.YEAR);
		this.c=c;
		
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public String getCal() {
		String str=Integer.toString(day)+"-"+Integer.toString(month)+"-"+Integer.toString(year);
		return str;
	}

}

public class BirthDate {

	public static void main(String[] args) {
		Cal c1=new Cal(new GregorianCalendar(2000,10,27));
		Cal c2=new Cal(new GregorianCalendar(2001,12,27));
		Cal c3=new Cal(new GregorianCalendar(2008,10,27));
		Cal c4=new Cal(new GregorianCalendar(2015,11,27));
		Cal c5=new Cal(new GregorianCalendar(2009,11,27));
		
		LinkedList<Cal> l=new LinkedList<>();
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		l.add(c5);
		
	for(Cal dob:l) {
		int year=dob.getYear();
		if((year%400==0) || ((year%4==0) && (year%100!=0))) {
			System.out.println("DOB is "+dob.getCal()+" it was a leap year");
		}
			
	}
	

	}

}
