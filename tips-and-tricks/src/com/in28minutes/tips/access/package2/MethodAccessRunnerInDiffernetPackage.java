package com.in28minutes.tips.access.package2;

import com.in28minutes.tips.nonaccess.package1.ExampleClass;

public class MethodAccessRunnerInDiffernetPackage {

	public static void main(String[] args) {
		
		ExampleClass exampleClass = new ExampleClass();
		//exampleClass.privateMethod();
		//exampleClass.protectedMethod();
		exampleClass.publicMethod();
		//exampleClass.defaultMethod();
		
	}

}
