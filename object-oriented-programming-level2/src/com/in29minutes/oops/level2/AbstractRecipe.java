package com.in29minutes.oops.level2;

public abstract class AbstractRecipe {
	//can not inherit for 2 or more classes for abstract 
	
	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanUp();	
	//prepare
	//recipe
	//cleanup

}
