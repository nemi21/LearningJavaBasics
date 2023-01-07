package com.in29minutes.oops.level2;

public class RecipeWithMicowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the micorwave");
	}

	@Override
	void doTheDish() {
		System.out.println("get stuff ready");
		System.out.println("Put it in the microwave");
	}

	@Override
	void cleanUp() {
		System.out.println("Clean up the utensils");
		System.out.println("Switch off the microwave");
	}

}
