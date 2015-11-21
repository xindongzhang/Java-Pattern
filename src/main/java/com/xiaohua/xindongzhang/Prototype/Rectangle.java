package com.xiaohua.xindongzhang.Prototype;

public class Rectangle extends Shape{

	public Rectangle() {
		type = "Rectangle";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method");
	}

}
