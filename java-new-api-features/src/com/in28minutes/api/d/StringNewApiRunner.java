package com.in28minutes.api.d;

class SampleClass {
	String str = null;
}

public class StringNewApiRunner {
	
	
	public static void main(String[] args) {
		System.out.println(" ".isBlank());
		System.out.println(" LR ".strip().replace(" ", "@"));
		System.out.println(" LR ".stripLeading().replace(" ", "@"));
		System.out.println(" LR ".stripTrailing().replace(" ", "@"));
		"Line1\nLine2\nline3\nLine4".lines().forEach(
				System.out::println);
		
		System.out.println("UPPER".transform(s -> s.substring(2)));
		System.out.println("My Name is %s. My age is %d "
				.formatted("Ranga", 25));
		
		SampleClass sample = new SampleClass();
		String str = null;
		System.out.println(sample.str.isBlank());
	}
}
