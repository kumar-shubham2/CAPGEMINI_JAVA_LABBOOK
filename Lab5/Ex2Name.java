package com.capg.Lab5;

import java.util.Scanner;

public class Ex2Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name: ");
		String f = sc.nextLine();
		System.out.println("Last Name: ");
		String l = sc.nextLine();
		sc.close();
		try {
			if (f.isEmpty() || l.isEmpty()) {
				throw new NullPointerException();
			} else
				System.out.println("Your name is: " + f + " " + l);
		} catch (NullPointerException e) {
			System.out.println("First and Last name should not be empty");
		}
	}

}
