package com.capg.Lab1;

import java.util.*;

public class Ex7CheckIncreasingDigitNumber {
	public static void main(String args[]) {
       int num;
       boolean flag = false;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number : ");
       num = sc.nextInt();
       sc.close();
       int currentDigit = num % 10;
       num = num / 10;
       while(num > 0){
           if(currentDigit <= num % 10){
               flag = true;
               break;
           }
           currentDigit = num % 10;
           num = num / 10;
       }
       if(flag){
           System.out.println("Digits are not in increasing order.");
       }else{
           System.out.println("Digits are in increasing order.");
       }
    }
}