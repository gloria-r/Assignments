package com.lavenberg;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class MondaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(weeksInCalendar(YearMonth.now()));
	  }

	  public static List<LocalDate> weeksInCalendar(YearMonth month) {
	    List<LocalDate> firstDaysOfWeeks = new ArrayList<>();
	    for (LocalDate day = firstDayOfCalendar(month); stillInCalendar(month, day); day = day
	        .plusWeeks(1)) {
	      firstDaysOfWeeks.add(day);
	    }
	    return firstDaysOfWeeks;
	  }

	  private static LocalDate firstDayOfCalendar(YearMonth month) {
	    DayOfWeek FIRST_DAY_OF_WEEK = DayOfWeek.MONDAY;
	    return month.atDay(1).with(FIRST_DAY_OF_WEEK);
	  }

	  private static boolean stillInCalendar(YearMonth yearMonth, LocalDate day) {
	    return !day.isAfter(yearMonth.atEndOfMonth());
	  }
	}
