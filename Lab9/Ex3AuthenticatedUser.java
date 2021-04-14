package com.capg.Lab9;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class Ex3AuthenticatedUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String, String> fun = (str1, str2) -> {
			if (str1.equals("Admin") && str2.equals("123"))
				return true;
			else
				return false;
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two strings: ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		
		boolean res1 = fun.test(str1, str2);
		System.out.println(res1);
	}

}
