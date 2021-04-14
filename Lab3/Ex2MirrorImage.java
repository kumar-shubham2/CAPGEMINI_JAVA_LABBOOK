package com.capg.Lab3;

import java.util.Scanner;

public class Ex2MirrorImage {
	public static String getImage(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = sc.nextLine();
		String rst = getImage(str);
		System.out.println("The String is : " + str + "|" + rst);
		sc.close();
	}

}