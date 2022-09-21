package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee emp;

  @Before
  public void setUp() {
    emp = new SalariedEmployee("Elihu", new Date(120, 2, 15), 85000D);
  }

  @Test
  public void testPay() {
    assertEquals(85000, emp.pay(), 0.0001);
  }

  @Test
  public void payTaxes() {
    double expected = 25500;
    double actual = emp.payTaxes();
    assertEquals(expected, actual, 0.001);
  }
}