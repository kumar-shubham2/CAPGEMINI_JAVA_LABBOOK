package com.capg.Lab9;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Ex1XY {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Double> fun = (x, y) -> Math.pow(x, y);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the values of x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		double res = fun.apply(x, y);
		System.out.println(res);
	}

}