package com.capg.Lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex3NumberSquares {
	static HashMap<Integer, Integer> getSquares(int[] array){
		HashMap<Integer, Integer> square = new HashMap<Integer, Integer>();
		for(int i: array) {
			square.put(i, (i * i));
		}
		return square;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Please Enter Array Values:");
		for(int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		HashMap<Integer, Integer> values = getSquares(array);
		Iterator<Integer> k = values.keySet().iterator();
		while(k.hasNext()) {
			Integer keyvalue = k.next();
			//System.out.println("Number" + "   " + "Squares");
			System.out.println(keyvalue + " : " + values.get(keyvalue));
		}
	}

}
