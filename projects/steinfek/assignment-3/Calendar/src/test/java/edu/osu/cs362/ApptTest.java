
package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
	/**
	 * Test that the gets methods work as expected.
	 */
	@Test
	public void test01()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());


		appt.setStartMonth(13);
		assertFalse(appt.getValid());
		appt.setStartMonth(0);
		assertFalse(appt.getValid());
		appt.setStartDay(32);
		assertFalse(appt.getValid());
		appt.setStartDay(0);
		assertFalse(appt.getValid());
		appt.setStartMinute(-1);
		assertFalse(appt.getValid());
		appt.setStartMinute(60);
		assertFalse(appt.getValid());
		appt.setStartHour(-1);
		assertFalse(appt.getValid());
		appt.setStartHour(24);
		assertFalse(appt.getValid());
		appt.setStartYear(2007);
		assertEquals(2007, appt.getStartYear());
		appt.setTitle("test title");
		assertEquals("test title", appt.getTitle());
		appt.setTitle(null);
		assertEquals("", appt.getTitle());
		appt.setDescription("test description");
		assertEquals("test description", appt.getDescription());
		appt.setDescription(null);
		assertEquals("", appt.getDescription());

	}
	public void test02() throws Throwable{
		int startHour = 13;
		int startMinute = 30;
		int startDay = 20;
		int startMonth = 4;
		int startYear = 2017;

		String title = "test title";
		String description = "test2";

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		//assertions
		assertTrue(appt.getValid());
		appt.setStartMonth(13);
		assertFalse(appt.getValid());
	}



}