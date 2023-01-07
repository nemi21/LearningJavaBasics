package com.in29minutes.oops.level2;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe1 recipe = new Recipe1();
		recipe.execute();
		
		RecipeWithMicowave recipeWithMicrowave = new RecipeWithMicowave();
		recipeWithMicrowave.execute();

	}

}
