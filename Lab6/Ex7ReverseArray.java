package com.capg.Lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex7ReverseArray {
	static int getSorted(int[] nums) { 
		Arrays.sort(nums);
    	String[] a = Arrays.toString(nums).split("[\\[\\]]")[1].split(", "); 
    	
    	Collections.reverse(Arrays.asList(a)); 
    	System.out.println(Arrays.asList(a));
    	return 0;
    } 
  
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Array Size: ");
		int n = sc.nextInt();
		int[] nums = new int[n];	
		System.out.println("Please Enter Array Elements: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
    	
    	getSorted(nums);
    	sc.close();
    } 
} 