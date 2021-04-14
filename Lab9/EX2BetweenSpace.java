package com.capg.Lab9;

import java.util.Scanner;
import java.util.function.Consumer;

public class EX2BetweenSpace {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> fun = str -> System.out.println(str.replace("", " ").trim());
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String name = sc.nextLine();
		sc.close();
		fun.accept(name);
	}
}
