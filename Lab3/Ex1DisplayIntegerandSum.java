package com.capg.Lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1DisplayIntegerandSum {
	public static void printIntegerSum(String input) {
		int sum = 0;
		StringTokenizer token = new StringTokenizer(input, " ");
		while (token.hasMoreTokens()) {
			int a = Integer.parseInt(token.nextToken());
			System.out.println(a);
			sum += a;
		}
		System.out.println("Sum is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter numbers: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		printIntegerSum(input);
	}

}
