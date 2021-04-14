package com.capg.Lab1;

import java.util.Scanner;

public class Ex8PowerOfTwo {
	public static boolean checkNumber(int num) {
		while(num % 2 == 0) {
			num = num / 2;
		}
		if(num == 1) {
			System.out.println("True: Entered number is a power of 2");
			return true;						
		}
		else {
			System.out.println("False: Entered number is not a power of 2");
			return false;			
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		sc.close();
		checkNumber(num);
	}

}
