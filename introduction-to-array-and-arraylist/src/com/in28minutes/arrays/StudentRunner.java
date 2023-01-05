package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		//int[] marks = {97,98,100};
		//Student student = new Student("Ranga", marks);
		
		Student student = new Student("Ranga", 97,98,100);
		
		Student student1 = new Student("Adam", 97,98);
		
		Student student2 = new Student("Eve", 97,98, 90, 98);
		
		int number = student.getNumberOfMarks();	
		System.out.println("Number of marks: " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks: " + sum);
		
		int maximumMark = student.getMaximunMark();
		System.out.println("Maxumin of marks: " + maximumMark);
		
		int minimunMark = student.getMinimunMark();
		System.out.println("Minimun of marks: "  + minimunMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average: " + average);
		
		System.out.println(student);
		
		student.addNewMark(35);
		System.out.println(student);
		
		student.removeMarkAtIndex(1);
		System.out.println(student);
	}

}
