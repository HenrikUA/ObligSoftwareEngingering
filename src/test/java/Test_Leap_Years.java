import org.junit.Test;

import static org.junit.Assert.*;

public class Test_Leap_Years {


  @Test
    public void IfDivBy4AndNot100_Tests(){
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


  /* @Test
    public void Check_If_Div_By_4(){
        assertEquals(true, YearsCheck.isLeapYear(1908));
        assertEquals(false, YearsCheck.isLeapYear(2013));
    }

    @Test
    public void Check_If_Div_By_100(){
        assertEquals(true, YearsCheck.isLeapYear(2012));
        assertEquals(false, YearsCheck.isLeapYear(2100));
    }*/

/*    @Test
    public void Check_If_Div_By_400(){
        assertEquals(true, YearsCheck.isLeapYear(1960));
        assertEquals(false, YearsCheck.isLeapYear(1800));

    }*/
  /*  @Test
    public void Check_If_Year_Is_Leap() {
        YearsCheck yearsCheck = new YearsCheck();

        assertTrue(YearsCheck.isLeapYear(2000));
        assertFalse(YearsCheck.isLeapYear(2001));
        assertFalse(YearsCheck.isLeapYear(1700));
    }*/
}
