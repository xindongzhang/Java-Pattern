package com.xiaohua.xindongzhang.Factory;

public class FactoryClient {

	public static void main(String[] args) {
		String shapeType0 = "circle";
		String shapeType1 = "rectangle";
		String shapeType2 = "square";
		Shape shape0 = ShapeFactory.getShape(shapeType0);
		Shape shape1 = ShapeFactory.getShape(shapeType1);
		Shape shape2 = ShapeFactory.getShape(shapeType2);
		shape0.draw();
		shape1.draw();
		shape2.draw();
	}

}
