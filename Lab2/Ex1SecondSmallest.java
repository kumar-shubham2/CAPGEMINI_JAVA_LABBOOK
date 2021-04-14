package com.capg.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1SecondSmallest {
	public static int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return a[1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(getSecondSmallest(a));
	}

}
