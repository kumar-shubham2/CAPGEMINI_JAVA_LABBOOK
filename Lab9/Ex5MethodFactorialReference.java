package com.capg.Lab9;

import java.util.Scanner;
import java.util.function.Function;
	class Factorial{
		public int fact(int no) {
			int f = 1, i;
			if(no >= 1){
				for(i = 1; i <= no; i++) {
					f = f * i;
				}
				return f;
			}
			else
				return 1;
		}
	}
	public class Ex5MethodFactorialReference {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Function<Integer,Integer> fun = new Factorial()::fact;
			System.out.println("Please enter two numbers: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int n1 = sc.nextInt();
			sc.close();
			int no = fun.apply(n);
			int no1 = fun.apply(n1);
			System.out.println(no + " " + no1);
		}
	}