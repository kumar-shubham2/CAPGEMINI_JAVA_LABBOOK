package com.capg.Lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex2CountCharArray {
	static HashMap<Character, Integer> charCount(char[] arr){
		HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();
		for(char ch:arr) {
			if(characterCount.containsKey(ch)) {
				characterCount.put(ch, characterCount.get(ch) + 1);
			}
			else {
				characterCount.put(ch, 1);
			}
		}
		return characterCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "SHUBHAM KUMAR SHARMA";
		char[] arr = name.toCharArray();
		HashMap<Character, Integer> map = charCount(arr);
		for(Map.Entry<Character, Integer> values: map.entrySet()) {
			System.out.println(values.getKey() + " " + values.getValue());
		}
	}
}
