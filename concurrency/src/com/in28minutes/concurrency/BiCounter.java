package com.in28minutes.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;
	
	synchronized public void incrementI() {
		i++; //15
		//get j, increment, set j
	}

	public int getI() {
		return i;
	}
	
	synchronized public void incrementJ() {
		j++; //15
		//get i, increment, set i
	}

	public int getJ() {
		return j;
	}
	
}
