package com.xiaohua.xindongzhang.Flyweight;

public class Demo {

	private static final String colors[] = {
		"red", "green", "blue", "white", "black"
	};
	
	private static String getRandomColor() {
		int idx = (int) Math.random() * colors.length;
		return colors[idx];
	}
	
	private static int getRandomX() {
		return (int) Math.random() * 100;
	}
	
	private static int getRandomY() {
		return (int) Math.random() * 100;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 30; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

}
