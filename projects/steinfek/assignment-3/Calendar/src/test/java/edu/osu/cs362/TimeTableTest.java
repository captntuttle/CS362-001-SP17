package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	@Test
	public void test01()  throws Throwable  {
		int thisMonth;
		int thisYear;
		int thisDay;
		Calendar rightnow = Calendar.getInstance();
		thisMonth = rightnow.get(Calendar.MONTH)+1;
		thisYear = rightnow.get(Calendar.YEAR);
		thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,1);

		LinkedList<Appt> inputAppts = new LinkedList<Appt>();
		LinkedList<CalDay> outputAppts = new LinkedList<CalDay>();


		TimeTable newTable = new TimeTable();

		outputAppts = newTable.getApptRange(inputAppts,today,tomorrow);
		assertEquals(1, outputAppts.size());
	}

}
