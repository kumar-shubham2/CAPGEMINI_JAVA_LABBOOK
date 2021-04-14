package com.capg.Lab1;

import java.util.Scanner;

public class Ex2TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select your choice from 'red', 'yellow', 'green': ");
		String choice = sc.next();
		if (choice.equalsIgnoreCase("red"))
			System.out.println("stop");
		else if (choice.equalsIgnoreCase("yellow"))
			System.out.println("wait");
		else if (choice.equalsIgnoreCase("green"))
			System.out.println("go");

		sc.close();
	}

}
