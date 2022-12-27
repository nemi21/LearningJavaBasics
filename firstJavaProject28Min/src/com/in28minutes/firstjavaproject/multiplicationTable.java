package com.in28minutes.firstjavaproject;

public class multiplicationTable {

	void print() {
		print(5);
	}//end of print method
	
	void print(int table) {
		print(table, 1, 10);
	}//end of print method

	void print(int table, int from, int to) {	
		for(int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}//end of for loop
	}//end of print method

}// end of class
