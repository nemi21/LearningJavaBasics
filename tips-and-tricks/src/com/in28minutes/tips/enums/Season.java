package com.in28minutes.tips.enums;
public enum Season {
	SUMMER(1), WINTER(2), FALL(3), SPRING(4);
	
	private int value;
	
	private Season(int value) {
		this.value = value;
	}
	//0,1,2,3

	public int getValue() {
		return value;
	}
	
	
}