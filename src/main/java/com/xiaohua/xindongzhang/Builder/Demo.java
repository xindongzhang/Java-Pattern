package com.xiaohua.xindongzhang.Builder;

public class Demo {
	
	public static void main(String args[]) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("veg meal");
		vegMeal.showItems();
		System.out.println("price : " + vegMeal.getCost());
		
	}
	
}
