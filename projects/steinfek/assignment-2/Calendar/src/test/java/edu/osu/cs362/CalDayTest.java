package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		  CalDay invalidCalday = new CalDay();
		  assertFalse(invalidCalday.isValid());

		  GregorianCalendar cal = new GregorianCalendar();
		  CalDay calday = new CalDay(cal);

		  int day = 9;
		  int month = 12;
		  int year = 1988;
		  int minute = 30;
		  int hour = 2;
		  String title = "birthday";
		  String description = "a special day for me";
		  Appt appt = new Appt(hour,
				  minute,
				  day,
				  month,
				  year,
				  title,
				  description);

		  calday.addAppt(appt);

		  Appt appt2 = new Appt(12,
				  30,
				  9,
				  9,
				  1955,
				  "an appt",
				  "a test");
		  calday.addAppt(appt2);

		  Appt appt3 = new Appt(2,
				  30,
				  5,
				  3,
				  1945,
				  "an appt",
				  "a test");
		  calday.addAppt(appt3);

		  Appt appt4 = new Appt(13,
				  31,
				  5, 
				  4, 
				  1989,
				  "invalid",
				  "appt");
		  calday.addAppt(appt4);

		  calday.iterator();
		  invalidCalday.iterator();

		  assertEquals(3, calday.getSizeAppts());
		  calday.getDay();
		  calday.getMonth();




	 }
	
}
