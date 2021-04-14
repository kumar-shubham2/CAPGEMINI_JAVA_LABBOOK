package com.capg.Lab1;

import java.util.*;

public class Ex4PrimeNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0, num = 0;
		String  primeNumbers = "";
	    System.out.println("Enter the value of n:");
	    int n = sc.nextInt();
	    sc.close();
	    for (i = 1; i <= n; i++)  	   
	    {  int counter = 0; 		  
	       for(num = i; num >= 1; num--)
	       {	if(i % num == 0){
	    	   counter = counter + 1;
		   }
		 }
		 if (counter == 2){	
			 primeNumbers = primeNumbers + i + " ";
		 }	
	    }	
	    System.out.println("Prime numbers from 1 to " + n + " are :");
	   
	    System.out.println(primeNumbers);
	}
}