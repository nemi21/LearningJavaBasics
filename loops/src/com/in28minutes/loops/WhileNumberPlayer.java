package com.in28minutes.loops;

public class WhileNumberPlayer {

	
	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaersUptoLimit() {
		//for limit = 30, output would be 1 4 9 16 25
		int i = 1;
		while(i * i< limit) {
			System.out.print(i* i + " ");
			i++;
		}
		System.out.println();
		
	}

	public void printCubesUptoLimit() {
		//For limit = 30, output would be 1 8 27
		int i = 1;
		while(i * i * i < limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
		
	}

}
