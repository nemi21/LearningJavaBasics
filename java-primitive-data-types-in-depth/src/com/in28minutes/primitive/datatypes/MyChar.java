package com.in28minutes.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}
	
	public boolean isVowel() {
		//'a' e i o u or A E I O U
		if(ch == 'a' || ch == 'e' || ch == 'i' || 
				ch == 'o' || ch == 'u') { 
			return true;
		}else if(ch == 'A' || ch == 'E' || ch == 'I' || 
				ch == 'O' || ch == 'U') {
			return true;
			} 
		return false;
	
		}
		

	public boolean isDigit() {
		//ch >= 48 || ch <=57
		//between '0' and '9'
		if(ch >= 48 && ch <=57 ) {
			return true;
		}else {
			return false;
		}
	}

	public boolean isAlphabet() {
		if(ch >= 65 && ch <=122 ) {
			//between 'A' and 'a' to 'z' and 'Z'
			return true;
		}else {
			return false;
		}
	}

	public static void printLowerCaseAlphabets() {
		//'a' to 'z'
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		//'A' to 'Z'
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

	public boolean isConsonant() {
		/*if(ch != 'a' || ch != 'e' || ch != 'i' || 
				ch != 'o' || ch != 'u') { 
			return true;
		}if(ch != 'A' || ch != 'E' || ch != 'I' || 
				ch != 'O' || ch != 'U') {
			return true;
			} 
		return false;*/
		if(isAlphabet() && !isVowel()) {
			return true;
		}else {
			return false;
		}
		
	}

}
