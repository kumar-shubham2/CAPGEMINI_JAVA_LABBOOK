package com.capg.Lab3;

import java.time.LocalDate;
import java.time.Period;

public class Ex9DateDifference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate pdate = LocalDate.of(2016, 05, 21);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(pdate, now);
		System.out.printf("Difference is %d years, "
				+ "%d months and %d days old\n\n", diff.getYears(), diff.getMonths(),diff.getDays());
	}

}
