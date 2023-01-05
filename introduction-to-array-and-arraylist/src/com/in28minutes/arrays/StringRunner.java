package com.in28minutes.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", 
				"Wednesday", "Thursday", "Friday", "Saturday"};
		//Find the most length of the string
		String most = "";
		for(String day: daysOfWeek) {
			if(day.length() > most.length()) {
				most = day;
				
			}
		}
		System.out.println("Day with Most number of characters " + most);
		
		for(int i = daysOfWeek.length-1; i >=  0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
