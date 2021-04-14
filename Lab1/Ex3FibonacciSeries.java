package com.capg.Lab1;

import java.util.Scanner;

public class Ex3FibonacciSeries {
	static int n1 = 1, n2 = 1, n3 = 0, i, nth1;  
	
	//recursion
	static int fib(int nth1){    
	    if (nth1 == 1) {
	    	return 1;
	    }
	    else if(nth1 == 2) {
	    	return 1;
	    }
	    else
	    	return (fib(nth1 - 1) + fib(nth1 - 2));
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in); 
		  		  
		  System.out.println("Enter nth element: ");
		  nth1 = sc.nextInt();
		  sc.close();
		  
		  //non recursive
		  for(i = 2;i < nth1; ++i)//loop starts from 2 because 0 and 1 are already printed    
		  {	n3 = n1 + n2;
		  n1=n2;
		  n2=n3;    
		  } 
		  
		  System.out.println(n3);
		  
		  System.out.println("--*--*--*--*");
		  
		  System.out.println(fib(nth1));
	}
}
