package edu.osu.cs362;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

	//private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	//private static final int NUM_TESTS=100;

    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {

	 	GregorianCalendar calendar = new GregorianCalendar();

	 	Random random = new Random();

		 CalDay cal = new CalDay(calendar);

		 int startHour = random.nextInt(22) + 1;
		 int startMinute = random.nextInt(58) + 1;
		 int startDay = random.nextInt(30) + 1;
		 int startMonth = random.nextInt(11) + 1;
		 int startYear = random.nextInt(3) + 2017;

		 String title = "testTitle";
		 String description = "testDescription";

		 Appt appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);

		cal.addAppt(appt);

		assertEquals(1, cal.getSizeAppts());

		 
	 }


	
}
