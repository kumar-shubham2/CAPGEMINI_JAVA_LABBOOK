package com.capg.Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ex1SortedValues {
	public static ArrayList<String> getValues(HashMap<String, String> capitals){
		ArrayList<String> valuesList = new ArrayList<String>(capitals.values());
		Collections.sort(valuesList);
		return valuesList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitals = new HashMap<>();
		capitals.put("US", "WASHINGTON DC");
		capitals.put("France", "Paris");
		capitals.put("Japan", "Tokyo");
		capitals.put("UK", "London");
		capitals.put("India", "New Delhi");
		ArrayList<String> valuesList = getValues(capitals);
		System.out.println(valuesList);
	}
}
