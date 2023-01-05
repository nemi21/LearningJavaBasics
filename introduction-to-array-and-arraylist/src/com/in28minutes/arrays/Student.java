package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for(int mark: marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximunMark() {
		/*int max = Integer.MIN_VALUE;//95,98,10
		
		for(int mark:marks) {
			if(mark > max) {
				max = mark;
			}//end of if*/
		return Collections.max(marks);
		
		//}
		
		//return max;
	}

	public int getMinimunMark() {
		/*int min = Integer.MAX_VALUE;//95,98,10
		
		for(int mark:marks) {
			if(mark < min) {
				min = mark;
			}//end of if
		}
		return min;*/
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		//sum
		//total
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		//98.6666666666666 Precision (3) 98.667 
		//98.6665 Round mode(UP)
	}
	
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

	

}
