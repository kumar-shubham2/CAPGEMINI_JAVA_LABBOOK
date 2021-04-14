package com.capg.Lab5;

import java.util.Scanner;

class ValAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	public ValAgeException(String s) {
		super(s);
	}
}

public class Ex1AgeValid {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.close();
		try {
			if (age <= 15)
				throw new ValAgeException("Fine");
			else
				System.out.println("Age : " + age);
		} catch (ValAgeException e) {
			System.out.println("Age of a person should be above 15.");
		}
	}
}
