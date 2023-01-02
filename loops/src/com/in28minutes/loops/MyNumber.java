package com.in28minutes.loops;

public class MyNumber {

	private int number; 
	
	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		//2 to number - 1
		//How can check if a number is divisible by 2?
		
		//guard check
		if(number < 2) {
			return false;
		}
		//Prime check
		for(int i = 2; i <= number-1; i++) {
			if(number % i == 0) {
				return false;
			}//end of if
		}//end of for
		
		return true;
		
	}//end of isPrime

	public int sumUptoN() {
		//1+2+3...n
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		//input is 6 except 1 , 6=>2,3
		
		int sum = 0;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
			sum = sum + i;
			}
		}
		
		return sum;
	}

	public void printANumberTrianlge() {
		//1
		//1 2
		//1 2 3
		//1 2 3 4
		//1 2 3 4 5
		for(int i = 1; i <=number; i++) {
			for(int j = 1; j <= i; j++) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
