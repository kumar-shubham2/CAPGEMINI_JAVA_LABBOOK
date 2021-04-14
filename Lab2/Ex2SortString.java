package com.capg.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2SortString {
	public static String[] sortStrings(String[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			char[] temp = arr[i].toCharArray();
			Arrays.sort(temp);
			String sorted = new String(temp);
			arr[i] = sorted.toLowerCase();
		}
		for (int i = arr.length / 2; i < arr.length; i++) {
			char[] temp = arr[i].toCharArray();
			Arrays.sort(temp);
			String sorted = new String(temp);
			arr[i] = sorted.toUpperCase();
		}
		return arr;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Array Size: ");
		int n = sc.nextInt();
		String[] arr = new String[n + 1];

		System.out.println("Please enter " + n + " strings to sort");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		sc.close();
		sortStrings(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
