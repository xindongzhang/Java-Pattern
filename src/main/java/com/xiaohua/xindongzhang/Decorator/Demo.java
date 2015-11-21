package com.xiaohua.xindongzhang.Decorator;

public class Demo {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("circle with normal border");
		circle.draw();
		
		System.out.println("\ncircle of red border");
		redCircle.draw();
		
		System.out.println("\nrectangle of red border");
		redRectangle.draw();
	}

}
