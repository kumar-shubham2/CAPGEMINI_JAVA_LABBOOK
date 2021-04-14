package com.capg.Lab1;

import java.util.Scanner;
public class Ex1SumofCubeofDigit {
	
	public static void sumofdigit(int n) {
		int sum = 0;
		while(n > 0) {
		int n1 = n % 10;
		n /= 10;	
		
		sum += n1 * n1 * n1;
	}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sumofdigit(n);
		sc.close();
	}

}
