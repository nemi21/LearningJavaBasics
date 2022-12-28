package com.in28mintues.oops;

public class Book {
	
	private int noOfCopies;
	
	Book() {
		this(10);
	}
	
	Book(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
	
	void setNoOfCopies(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
	
	void turnPage() {
		System.out.println("Turning the page.");
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}
	
	public void setnoOfCopies(int noOfCopies) {
		if(noOfCopies > 0) 
			this.noOfCopies = noOfCopies;
		
	}
	
	public void increaseSpeed(int howMuch) {
		setnoOfCopies(this.noOfCopies = this.noOfCopies + howMuch);
	}
	
	public void decreaseSpeed(int howMuch) {
		setnoOfCopies(this.noOfCopies = this.noOfCopies - howMuch);
	}
	
}
