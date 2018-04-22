/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable
  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
@Test(timeout = 4000)
 public void test01()  throws Throwable
 {
      //Appt myAppt00 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      Appt myAppt01 = new Appt(12, -30, 0, 7, 0, "House Warming", "This is my house", "abc@yahoo.com");
      //myAppt00.setValid();
      myAppt01.setValid();
      myAppt01.getXmlElement();
      myAppt01.getEmailAddress();
      myAppt01.getRecurDays();
      myAppt01.getRecurIncrement();
      myAppt01.isOn(2, 6, 2000);
      myAppt01.hasTimeSet();
 }

}
