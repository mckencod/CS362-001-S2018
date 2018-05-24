package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 long randomseed = System.currentTimeMillis();
		 Random rand = new Random(randomseed);
		 GregorianCalendar gCal = new GregorianCalendar(2015, 3, 5);
		 CalDay calday = new CalDay(gCal);

		 for(int i = 0; i < 500; i++)
		 {
		 	int startHour = ValuesGenerator.getRandomIntBetween(rand, 1, 11);
		 	int startMinute = ValuesGenerator.getRandomIntBetween(rand, 1, 59);
		 	int startDay = ValuesGenerator.getRandomIntBetween(rand, 1, 30);
		 	int startMonth = ValuesGenerator.getRandomIntBetween(rand, 1, 11);
		 	int startYear = ValuesGenerator.getRandomIntBetween(rand, 2000, 2018);
		 	String title = "Holiday";
		 	String description = "It is a holiday";
		 	String emailAddress = "abc@email.com";

		 	Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description, emailAddress);

		 	calday.addAppt(appt);
		 	System.out.println("This is test" + i + " out of 100");
		 }		 
	 }


	
}
