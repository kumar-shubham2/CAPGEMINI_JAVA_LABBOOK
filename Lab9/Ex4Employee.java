package com.capg.Lab9;

import java.util.Scanner;
import java.util.function.BiFunction;

class Employee {
	String fname;
	String lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String FullName(String fname, String lname) {
		return (fname.concat(" " + lname));
	}

}

public class Ex4Employee {

	public static void main(String[] args) {
		System.out.println("Please enter fname and lname: ");
		Scanner sc = new Scanner(System.in);
		String fname = sc.nextLine();
		String lname = sc.nextLine();
		sc.close();
		BiFunction<String, String, String> fun = new Employee()::FullName;
		String fullname = fun.apply(fname, lname);
		System.out.println(fullname);
	}

}
