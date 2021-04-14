package com.capg.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3SortingArray {
	public static int[] getSorted(int[] arr,int n) {
		int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = arr[i]; 
            j = j - 1; 
        }
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		return b;
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
		sc.close();
		getSorted(arr, n);	
	}
}
