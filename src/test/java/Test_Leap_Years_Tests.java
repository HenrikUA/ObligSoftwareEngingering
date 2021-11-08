import org.junit.Test;

import static org.junit.Assert.*;

public class Test_Leap_Years_Tests {


  @Test
    public void TestIfDivBy4AndNot100(){
    boolean leap = YearsCheck.isLeapYear(2020);
    assertTrue(leap);
  }

  @Test
    public void CheckIfDivBy400(){
    boolean leap = YearsCheck.isLeapYear(2000);
    assertTrue(leap);
  }

  @Test
    public void CheckIfNotDivBy4(){
    boolean leap = YearsCheck.isLeapYear(77);
    assertFalse(leap);
  }

  @Test
    public  void CheckIfDivBy100AndNot400(){
    boolean leap = YearsCheck.isLeapYear(1700);
    assertFalse(leap);
  }



}
