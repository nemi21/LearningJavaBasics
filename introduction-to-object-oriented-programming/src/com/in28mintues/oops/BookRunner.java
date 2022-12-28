package com.in28mintues.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(25);
		Book newCode = new Book();
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		System.out.println(newCode.getNoOfCopies());
		
		
		artOfComputerProgramming.turnPage();
		effectiveJava.turnPage();
		cleanCode.turnPage();
		
		//artOfComputerProgramming.setNoOfCopies(5);
		//effectiveJava.setNoOfCopies(25);
		//cleanCode.setNoOfCopies(20);
		
		artOfComputerProgramming.increaseSpeed(10);
		effectiveJava.increaseSpeed(10);
		cleanCode.increaseSpeed(10);
		
		artOfComputerProgramming.decreaseSpeed(5);
		effectiveJava.decreaseSpeed(5);
		cleanCode.decreaseSpeed(5);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

	}

}
