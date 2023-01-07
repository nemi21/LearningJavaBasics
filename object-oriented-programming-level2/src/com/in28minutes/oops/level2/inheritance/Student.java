package com.in28minutes.oops.level2.inheritance;

public class Student extends Person {
	private String collegeName;
	private int year;
	
	public Student(String name, String collegeName) {
		super(name);
		this.collegeName = collegeName;
	}
	
	public String getCollgeName() {
		return collegeName;
	}
	public void setCollgeName(String collgeName) {
		this.collegeName = collgeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
