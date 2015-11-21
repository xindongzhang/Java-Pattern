package com.xiaohua.xindongzhang.Template;

public class Demo {

	public static void main(String[] args) {
		Game game1 = new Cricket();
		game1.play();
		
		System.out.println();
		
		Game game2 = new Football();
		game2.play();
	}

}
