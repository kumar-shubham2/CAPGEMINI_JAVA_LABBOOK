package com.capg.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4RemoveDuplicates {
	public static void modifyarray(int arr[], int n) {
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		for (int m = 0; m < arr.length; m++)
			System.out.print("  " + arr[m]);
		Arrays.sort(arr);
		System.out.println();
		System.out.print("Arrays in Sorted Order: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("You entered following array: ");
		sc.close();
		modifyarray(arr, n);
	}

}
