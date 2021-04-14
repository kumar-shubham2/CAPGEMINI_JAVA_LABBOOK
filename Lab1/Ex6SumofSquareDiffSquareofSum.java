package com.capg.Lab1;

import java.util.*;

public class Ex6SumofSquareDiffSquareofSum {
	static int calculateDifference(int n) {
		int a, b, diff;
		a = (n * (n + 1) * (2 * n + 1)) / 6;
		b = (n * (n + 1)) / 2;
		b = b * b;
		diff = Math.abs(a - b);
		return diff;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println(calculateDifference(n));
	}
}