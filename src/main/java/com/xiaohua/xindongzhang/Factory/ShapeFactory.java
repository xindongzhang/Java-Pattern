package com.xiaohua.xindongzhang.Factory;

public class ShapeFactory {
	public static Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equals("circle")) {
			return new Circle();
		} else if (shapeType.equals("rectangle")) {
			return new Rectangle();
		} else if (shapeType.equals("square")) {
			return new Square();
		}
		return null;
	}
}
