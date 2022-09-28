/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
  
  // prevent direct instantiation - this is an all-static factory class
  private EmployeeFactory() {
  }
  
  /**
   * TODO: given the input map, create and return the correct object (with its properties set).
   * If the input map's "type" value is not "HE" or "SE", throw IllegalArgumentException with a suitable message.
   */
  public static Employee createEmployee(Map<String, String> inputMap)
  throws IllegalArgumentException {
    // return value
    Employee emp = null;
    String type = inputMap.get("type");
    if (type != "HE" || type != "SE") {
      throw new IllegalArgumentException("Invalid type value: Must be HE or SE");
    }

    if(type == "HE") {
     HourlyEmployee emp = new HourlyEmployee(inputMap.))

    }else {

    }




    // todo if not HE or SE type then throw IAE
    // todo read name and hireDate  from inputMap....all values are String based on line 24 parameters. hireDate is not string.
    // todo if type is equal to HE then read rate (and parse) and hours from inputMap.
    // todo if tpye is equal to SE then read (and parse) salary from inputMap.
    // todo Create and return an instance of HourlyEmployee or SalariedEmployee, with the values read from inputMap.

    return emp;
  }
}