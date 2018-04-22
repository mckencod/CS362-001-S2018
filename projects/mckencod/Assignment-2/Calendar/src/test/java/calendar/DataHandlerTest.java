
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;
import calendar.CalendarUtil;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


public class DataHandlerTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  
  {
  	DataHandler handlerTest00 = new DataHandler();
  	GregorianCalendar gCal = new GregorianCalendar (2000, 10, 5);
  	CalDay Test00 = new CalDay(gCal);

  	Appt myAppt00 = new Appt(20, 15, 5, 4, 1989, 
  		"Something Happened", "Just like the title says", 
  		"noneyabiznes@goaway.net");
  	Appt myAppt01 = new Appt(10, 36, 47, 7, 2001, 
  		"A Certain Date", "This is just some date", 
  		"thisday@calendar.com");

  	myAppt00.setValid();
  	myAppt00.getRecurIncrement();
  	//Test00.addAppt(myAppt00);
  	//Test00.addAppt(myAppt01);
  	//Test00.getSizeAppts();
  	assertTrue(handlerTest00.saveAppt(myAppt00));
  	handlerTest00.deleteAppt(myAppt00);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  
  {
  	DataHandler handlerTest00 = new DataHandler();
  	GregorianCalendar gCal00 = new GregorianCalendar (2000, 10, 5);
  	GregorianCalendar gCal01 = new GregorianCalendar (2010, 20, 15);
  	GregorianCalendar gCal02 = new GregorianCalendar (2030, 40, 25);

  	Appt myAppt00 = new Appt(20, 15, 5, 4, 1989, 
  		"Something Happened", "Just like the title says", 
  		"noneyabiznes@goaway.net");
  	Appt myAppt01 = new Appt(10, 36, 47, 7, 2001, 
  		"A Certain Date", "This is just some date", 
  		"thisday@calendar.com");

  	handlerTest00.getApptRange(gCal00, gCal02);
  	handlerTest00.getNextApptOccurrence(myAppt00, gCal00);
  }

}
