package com.lavenberg;

import java.time.Month;
import java.time.YearMonth;

public class LengthOfMonths {
  public static void main(String[] args) {
	  
    for (Month month : Month.values()) {
      YearMonth myYear = YearMonth.of(2021, month);
      System.out.printf("%s: %d days%n", month, myYear.lengthOfMonth());
    }
  }
}

