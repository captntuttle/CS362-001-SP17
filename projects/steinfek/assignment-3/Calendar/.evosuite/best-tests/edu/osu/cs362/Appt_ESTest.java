/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 02:52:43 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, (-1553), 11, (String) null, "|E7");
      assertEquals(-1553, appt0.getStartMonth());
      
      appt0.setStartMonth(11);
      String string0 = appt0.toString();
      assertEquals("\t11/11/11 at 11:11am ,, |E7\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, (String) null);
      boolean boolean0 = appt0.getValid();
      assertEquals(1, appt0.getStartMinute());
      assertEquals(1, appt0.getStartYear());
      assertEquals(1, appt0.getStartMonth());
      assertEquals(1, appt0.getStartHour());
      assertTrue(boolean0);
      assertEquals(1, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(4469, 12, 4469, 4469, 12, "qP72pANu", "qP72pANu");
      String string0 = appt0.getTitle();
      assertEquals("qP72pANu", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(4469, appt0.getStartHour());
      assertEquals(12, appt0.getStartYear());
      assertEquals(4469, appt0.getStartDay());
      assertEquals("qP72pANu", string0);
      assertEquals(12, appt0.getStartMinute());
      assertEquals(4469, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, (String) null);
      int int0 = appt0.getStartYear();
      assertEquals(1, appt0.getStartDay());
      assertEquals(1, int0);
      assertTrue(appt0.getValid());
      assertEquals(1, appt0.getStartHour());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(1, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt((-5387), 875, (-5387), 875, 0, "", "r@!7}W^p`=G;");
      assertEquals(0, appt0.getStartYear());
      
      appt0.setStartYear((-1));
      int int0 = appt0.getStartYear();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt((-1359), (-1359), (-762), 1600, (-1359), "UWB\"@.l7rT m[,", "UWB\"@.l7rT m[,");
      int int0 = appt0.getStartMonth();
      assertEquals(-762, appt0.getStartDay());
      assertEquals("UWB\"@.l7rT m[,", appt0.getDescription());
      assertEquals("UWB\"@.l7rT m[,", appt0.getTitle());
      assertEquals(-1359, appt0.getStartMinute());
      assertEquals(-1359, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(-1359, appt0.getStartYear());
      assertEquals(1600, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt((-1130), (-1130), 680, (-1130), (-1130), ".", "}x&eX&zMZ!Qf{6");
      int int0 = appt0.getStartMonth();
      assertEquals(".", appt0.getTitle());
      assertEquals("}x&eX&zMZ!Qf{6", appt0.getDescription());
      assertEquals((-1130), int0);
      assertEquals(-1130, appt0.getStartMinute());
      assertEquals(-1130, appt0.getStartYear());
      assertEquals(-1130, appt0.getStartHour());
      assertEquals(680, appt0.getStartDay());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt((-5387), 875, (-5387), 875, 0, "", "r@!7}W^p`=G;");
      int int0 = appt0.getStartMinute();
      assertEquals(875, appt0.getStartMonth());
      assertEquals(875, int0);
      assertEquals(0, appt0.getStartYear());
      assertEquals(-5387, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals("r@!7}W^p`=G;", appt0.getDescription());
      assertEquals("", appt0.getTitle());
      assertEquals(-5387, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(0, (-264), (-264), (-264), 0, "", "HMS");
      int int0 = appt0.getStartHour();
      assertEquals(-264, appt0.getStartMonth());
      assertEquals(-264, appt0.getStartMinute());
      assertEquals(0, int0);
      assertEquals(-264, appt0.getStartDay());
      assertEquals("", appt0.getTitle());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals("HMS", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, (-1553), 11, (String) null, "|E7");
      int int0 = appt0.getStartHour();
      assertEquals(11, appt0.getStartYear());
      assertEquals(11, int0);
      assertEquals(11, appt0.getStartMinute());
      assertEquals(-1553, appt0.getStartMonth());
      assertEquals(11, appt0.getStartDay());
      assertEquals("", appt0.getTitle());
      assertEquals("|E7", appt0.getDescription());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, (String) null);
      int int0 = appt0.getStartDay();
      assertEquals(1, appt0.getStartHour());
      assertEquals(1, appt0.getStartYear());
      assertEquals(1, appt0.getStartMonth());
      assertEquals(1, int0);
      assertEquals(1, appt0.getStartMinute());
      assertTrue(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt((-2544), (-2544), (-2544), (-2544), (-2544), "", ", ");
      int int0 = appt0.getStartDay();
      assertEquals(-2544, appt0.getStartYear());
      assertEquals(-2544, appt0.getStartHour());
      assertEquals(-2544, appt0.getStartMonth());
      assertEquals(-2544, appt0.getStartMinute());
      assertEquals((-2544), int0);
      assertEquals("", appt0.getTitle());
      assertEquals(", ", appt0.getDescription());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt((-681), (-681), (-681), (-681), (-2178), "", "");
      appt0.getDescription();
      assertEquals(-2178, appt0.getStartYear());
      assertEquals(-681, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(-681, appt0.getStartMonth());
      assertEquals(-681, appt0.getStartMinute());
      assertEquals(-681, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt((-5387), 875, (-5387), 875, 0, "", "r@!7}W^p`=G;");
      appt0.setDescription(".{$lGNG");
      assertEquals(".{$lGNG", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, (-1553), 11, (String) null, "|E7");
      assertEquals("|E7", appt0.getDescription());
      
      appt0.setDescription((String) null);
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt((-5387), 875, (-5387), 875, 0, "", "r@!7}W^p`=G;");
      assertEquals("", appt0.getTitle());
      
      appt0.setTitle("r@!7}W^p`=G;");
      assertEquals("r@!7}W^p`=G;", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, (String) null);
      appt0.setTitle((String) null);
      assertTrue(appt0.getValid());
      assertEquals(1, appt0.getStartYear());
      assertEquals(1, appt0.getStartHour());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(1, appt0.getStartDay());
      assertEquals(1, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 23, 12, 23, "Y$,P", "Y$,P");
      appt0.setStartHour(0);
      appt0.toString();
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 23, 12, 23, "Y$,P", "Y$,P");
      String string0 = appt0.toString();
      assertEquals("\t12/23/23 at 11:23pm ,Y$,P, Y$,P\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt((-5387), 875, (-5387), 875, 0, "", "r@!7}W^p`=G;");
      appt0.setStartDay(31);
      appt0.setStartHour(11);
      appt0.setStartMinute(59);
      assertEquals(11, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, (-1553), 11, (String) null, "|E7");
      String string0 = appt0.toString();
      assertEquals("|E7", appt0.getDescription());
      assertEquals("", appt0.getTitle());
      assertEquals(11, appt0.getStartYear());
      assertEquals(11, appt0.getStartHour());
      assertNull(string0);
      assertEquals(11, appt0.getStartDay());
      assertEquals(11, appt0.getStartMinute());
      assertEquals(-1553, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt(39, (-1003), (-1003), 0, 39, "h~DM}2T38:Bm^EwsIz", "h~DM}2T38:Bm^EwsIz");
      appt0.setStartHour(0);
      appt0.setStartDay(1878);
      appt0.setStartMinute(39);
      assertEquals(1878, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt((-5387), 875, (-5387), 875, 0, "", "r@!7}W^p`=G;");
      appt0.setStartHour(11);
      assertEquals(11, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(0, (-1), (-1), 59, 0, ":", ":");
      int int0 = appt0.getStartMinute();
      assertEquals(-1, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(":", appt0.getDescription());
      assertEquals(59, appt0.getStartMonth());
      assertEquals(0, appt0.getStartHour());
      assertEquals(":", appt0.getTitle());
      assertEquals(0, appt0.getStartYear());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt((-2745), (-2745), (-2745), (-2745), (-2745), (String) null, (String) null);
      String string0 = appt0.getTitle();
      assertFalse(appt0.getValid());
      assertEquals(-2745, appt0.getStartMinute());
      assertEquals(-2745, appt0.getStartMonth());
      assertEquals(-2745, appt0.getStartDay());
      assertEquals(-2745, appt0.getStartHour());
      assertEquals(-2745, appt0.getStartYear());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(935, 935, 935, 59, 0, "<8EX>(", "9zO'Zo3kwM0zyJ");
      int int0 = appt0.getStartYear();
      assertFalse(appt0.getValid());
      assertEquals("<8EX>(", appt0.getTitle());
      assertEquals(0, int0);
      assertEquals(935, appt0.getStartDay());
      assertEquals("9zO'Zo3kwM0zyJ", appt0.getDescription());
      assertEquals(59, appt0.getStartMonth());
      assertEquals(935, appt0.getStartHour());
      assertEquals(935, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(4413, 644, 0, 644, (-751), "`kLx;E", "\"dF};k.Rn+T[p[6J");
      int int0 = appt0.getStartDay();
      assertEquals(-751, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(0, int0);
      assertEquals(4413, appt0.getStartHour());
      assertEquals("`kLx;E", appt0.getTitle());
      assertEquals(644, appt0.getStartMinute());
      assertEquals(644, appt0.getStartMonth());
      assertEquals("\"dF};k.Rn+T[p[6J", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt((-4389), 2199, (-4389), 2199, (-4389), ", ", "pm");
      int int0 = appt0.getStartHour();
      assertEquals(-4389, appt0.getStartYear());
      assertEquals((-4389), int0);
      assertEquals(2199, appt0.getStartMonth());
      assertEquals(2199, appt0.getStartMinute());
      assertEquals(", ", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-4389, appt0.getStartDay());
      assertEquals("pm", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt((-5387), 875, (-5387), 875, 0, "", "r@!7}W^p`=G;");
      String string0 = appt0.getDescription();
      assertEquals(875, appt0.getStartMinute());
      assertEquals(-5387, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals("", appt0.getTitle());
      assertEquals(-5387, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertEquals("r@!7}W^p`=G;", string0);
      assertEquals(875, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(1467, 1467, 1467, 0, 0, "", "");
      int int0 = appt0.getStartMonth();
      assertFalse(appt0.getValid());
      assertEquals(0, int0);
      assertEquals(1467, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(1467, appt0.getStartDay());
      assertEquals(1467, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(1467, 1467, 1467, 0, 0, "", "");
      boolean boolean0 = appt0.getValid();
      assertEquals(0, appt0.getStartMonth());
      assertEquals(1467, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertFalse(boolean0);
      assertEquals(1467, appt0.getStartMinute());
      assertEquals(1467, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 970, 0, (String) null, "1697-02-01T00:00:00Z");
      int int0 = appt0.getStartMinute();
      assertFalse(appt0.getValid());
      assertEquals("", appt0.getTitle());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals(970, appt0.getStartMonth());
      assertEquals(0, int0);
      assertEquals("1697-02-01T00:00:00Z", appt0.getDescription());
      assertEquals(0, appt0.getStartDay());
  }
}
