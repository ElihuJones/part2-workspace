package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {

  private HourlyEmployee emp; //To demo when @Before get invoked

  @Before
  public void setUp() {
    emp = new HourlyEmployee("Elihu", new Date(120, 2, 15), 25.0, 40.0);
  }

  @Test
  public void pay() {
    assertEquals(1000, emp.pay(), 0.001);
  }

  @Test
  public void payTaxes() {
    double expected = 250;
    double actual = emp.payTaxes();
    assertEquals(expected, actual, 0.001);
    //assertEquals(250, emp.payTaxes(), 0.001);   This is equivalent to the 3 lines above
  }
}