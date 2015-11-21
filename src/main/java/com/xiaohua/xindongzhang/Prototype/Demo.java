package com.xiaohua.xindongzhang.Prototype;

public class Demo {

	public static void main(String[] args) {
		
		ShapeCache.loadCache();
		
		Shape clonedShape0 = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape0.getType());
		
		Shape clonedShape1 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape1.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape: " + clonedShape2.getType());
	}

}
