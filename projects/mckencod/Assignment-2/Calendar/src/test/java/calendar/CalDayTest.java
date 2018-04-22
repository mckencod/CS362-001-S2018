/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable
  {
  	CalDay empty = new CalDay();

  	Appt myAppt00 = new Appt(20, 15, 5, 4, 1989, 
  		"Something Happened", "Just like the title says", 
  		"noneyabiznes@goaway.net");

  	Appt myAppt01 = new Appt(10, 36, 47, 7, 2001, 
  		"A Certain Date", "This is just some date", 
  		"thisday@calendar.com");

  	GregorianCalendar gCal = new GregorianCalendar (2000, 10, 5);
  	CalDay Test00 = new CalDay(gCal);
  	Test00.addAppt(myAppt00);
  	Test00.addAppt(myAppt01);
  	Test00.getSizeAppts();

  	assertTrue(Test00.isValid());

  	Test00.getFullInfomrationApp(Test00);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable
  {
  	GregorianCalendar gCal = new GregorianCalendar (2000, 10, 5);
  	CalDay Test00 = new CalDay(gCal);
  	String stringTest00 = Test00.toString();

  	assertEquals(("\t ---  " + Test00.getMonth()+1) + "/" + Test00.getDay() + "/" +
  				  Test00.getYear() + " --- \n" + 
  				  "--- ------- Appointments ------------ --- \n", stringTest00);
  }

}
