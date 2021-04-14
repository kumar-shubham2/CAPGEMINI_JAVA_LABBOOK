package com.capg.Lab5;

import java.util.Scanner;

class EmployeeException extends Exception {
	private static final long serialVersionUID = 1L;
	public EmployeeException(String s) {
		super(s);
	}
}

public class Ex3EmployeeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary of the Employee: ");
		double salary = sc.nextDouble();
		sc.close();
		try {
			if (salary < 3000)
				throw new EmployeeException("Good");
			else
				System.out.println("Salary : " + salary);
		} catch (EmployeeException e) {
			System.out.println("Salary less than 3000.");
		}
	}

}
