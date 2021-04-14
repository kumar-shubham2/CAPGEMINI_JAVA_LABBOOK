package com.capg.Lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex5SecondSmallest{  
	public static int getSecondSmallest(Integer[] a, int total){  
		List<Integer> list = Arrays.asList(a);  
		Collections.sort(list);  
		int element = list.get(1);  
		return element;  
	}  
	public static void main(String args[]){
		// TODO Auto-generated method stub
		Integer a[] = {20, 59, 48, 45, 3};  
		System.out.println("Second Smallest Element is: " + getSecondSmallest(a,5));  
	}
}  