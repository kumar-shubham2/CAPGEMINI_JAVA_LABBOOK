package com.capg.Lab6;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex2CountCharacterInArray {
	public Map<Character, Integer> countCharacter(char[] ch) {
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				int p = map.get(ch[i]);
				map.put(ch[i], p + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char array length: ");
		int n = sc.nextInt(); 
		char c[] = new char[n]; 
		String temp;
		for (int i = 0; i < n; i++){ 
			temp = sc.next(); 
		if(temp.length() == 1) { 
			c[i] = temp.charAt(0); 
			} 
			else{ 
				System.out.println("Please enter only a characters...!");
				break;
			}
		}
		sc.close();
		
		Ex2CountCharacterInArray e = new Ex2CountCharacterInArray();
		System.out.println(e.countCharacter(c));
	}
}
