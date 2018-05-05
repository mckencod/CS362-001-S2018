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
      Appt appt1 = new Appt(15, 30, 9, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      Appt appt2 = new Appt(0, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
//      assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
      appt1.setValid();
      appt2.setValid();

  }
@Test(timeout = 4000)
 public void test01()  throws Throwable
 {
      //Appt myAppt00 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      Appt myAppt01 = new Appt(12, 30, 5, 7, 2000, "House Warming", "This is my house", "abc@yahoo.com");
      //myAppt00.setValid();
      myAppt01.setValid();
      myAppt01.getXmlElement();
      myAppt01.getEmailAddress();
      myAppt01.getRecurDays();
      myAppt01.getRecurIncrement();
      //myAppt01.isOn(2, 6, 2000);
      assertTrue(myAppt01.isOn(5, 7, 2000));
      //assertTrue(myAppt01.getValid());
      myAppt01.hasTimeSet();
 }
 @Test(timeout = 4000)
  public void test02()  throws Throwable
  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
//      assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      //appt0.setXmlElement(null);
      appt0.setStartHour(2);
      appt0.setStartMinute(25);
      appt0.setStartDay(3);
      appt0.setStartYear(2015);
      appt0.setStartMonth(5);
      appt0.setTitle("This is a Title");
      appt0.setDescription("This is really something.");
      //ppt0.setEmailAddress("Stuff@things.net");

      //assertEquals(null, appt0.getXmlElement());
      assertEquals(2, appt0.getStartHour());
      assertEquals(25, appt0.getStartMinute());
      assertEquals(3, appt0.getStartDay());
      assertEquals(2015, appt0.getStartYear());
      assertEquals(5, appt0.getStartMonth());
      assertEquals("This is a Title", appt0.getTitle());
      //assertEquals("This is really something.", appt0.getDescription());
      //assertEquals("Stuff@things.net", appt0.getEmailAddress());

      appt0.setValid();
  }

}
