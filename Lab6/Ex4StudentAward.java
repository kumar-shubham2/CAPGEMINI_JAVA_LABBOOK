package com.capg.Lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex4StudentAward {
	static HashMap<String, String> getStudents(HashMap<String, Integer> student){
		HashMap<String, String> medals = new HashMap<String, String>();
		for(Map.Entry<String, Integer> values : student.entrySet()) {
			if(values.getValue() >= 95) {
				medals.put(values.getKey(), "Diamond");
			}
			else if(values.getValue() >= 75) {
				medals.put(values.getKey(), "Gold");
			}
			else if(values.getValue() >= 50) {
				medals.put(values.getKey(), "Silver");
			}
			else if(values.getValue() >= 25) {
				medals.put(values.getKey(), "Bronze");
			}
			else
				medals.put(values.getKey(), "Please try next time");
		}
		return medals;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> student = new HashMap<>();
		student.put("1719210125", 53);
		student.put("1719210185", 84);
		student.put("1719210148", 11);
		student.put("1719210256", 96);
		student.put("1719210178", 26);
		HashMap<String, String> p = getStudents(student);
		for(Map.Entry<String, String> values : p.entrySet()){
			System.out.println(values.getKey() + " " + values.getValue());
		}
	}
}
