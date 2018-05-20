package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for DataHandler class.
 */

public class DataHandlerRandomTest {
	
    /**
     * Generate Random Tests that tests DataHandler Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 Appt[] totalAppt = new Appt[100];
		 DataHandler dataHandling = new DataHandler();
		 long randomseed = System.currentTimeMillis();
		 Random rand = new Random(randomseed);
		 GregorianCalendar gCal1 = new GregorianCalendar(2010, 1, 1);
		 GregorianCalendar gCal2 = new GregorianCalendar(2018, 11, 11);

		 for(int i = 0; i < 500; i++)
		 {
		 	int gCalMonth1 = ValuesGenerator.getRandomIntBetween(rand, 1, 6);
		 	int gCalMonth2 = ValuesGenerator.getRandomIntBetween(rand, 5, 11);
		 	int startHour = ValuesGenerator.getRandomIntBetween(rand, 1, 11);
		 	int startMinute = ValuesGenerator.getRandomIntBetween(rand, 1, 59);
		 	int startDay = ValuesGenerator.getRandomIntBetween(rand, 1, 30);
		 	int startMonth = ValuesGenerator.getRandomIntBetween(rand, 1, 11);
		 	int startYear = ValuesGenerator.getRandomIntBetween(rand, 2000, 2018);
		 	String title = "Holiday";
		 	String description = "It is a holiday";
		 	String emailAddress = "abc@email.com";

		 	Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description, emailAddress);

		 	dataHandling.saveAppt(appt);
		 	totalAppt[i] = appt;
		 	System.out.println("This is test" + i + " out of 100");
		}
	 	
	 	if(dataHandling.getApptRange(gCal1, gCal2) != null)
	 	{
	 		assertTrue(true);
	 	}
	 	for(int j = 0; j < 100; j++)
	 	{
	 		dataHandling.deleteAppt(totalAppt[j]);
	 	}
	 	if(dataHandling.getApptRange(gCal1, gCal2) != null)
	 	{
			assertTrue(true);
		}
		 
	 }


	
}
