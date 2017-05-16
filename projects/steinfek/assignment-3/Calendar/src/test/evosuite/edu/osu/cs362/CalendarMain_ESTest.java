/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 16:08:41 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.CalendarMain;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CalendarMain_ESTest extends CalendarMain_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        CalendarMain.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CalendarMain calendarMain0 = new CalendarMain();
  }
}
