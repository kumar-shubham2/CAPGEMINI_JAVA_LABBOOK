package com.capg.Lab3;

import java.util.Scanner;

public class Ex3Consonants {
	public static String getImage(char[] str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i] == 'a' || str[i] == 'e' || 
					str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
				continue;
			} else {
				str[i] = (char) (str[i] + 1);
			}
		}
		return String.valueOf(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = sc.nextLine();
		sc.close();
		String res = getImage(str.toLowerCase().toCharArray());
		System.out.println("The String is : " + res.toUpperCase());

	}
}
