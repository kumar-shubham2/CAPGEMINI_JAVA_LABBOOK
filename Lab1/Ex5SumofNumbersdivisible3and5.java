package com.capg.Lab1;

import java.util.*;

public class Ex5SumofNumbersdivisible3and5 {
	public static int calculateSum(int n) {
		int sum = 0;
		for (int num = 0; num <= n; num++) {

			if (num % 3 == 0 && num % 5 == 0)
				sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Sum of numbers divisible by 3 and 5 upto " + n + " is " + calculateSum(n));
	}
}
