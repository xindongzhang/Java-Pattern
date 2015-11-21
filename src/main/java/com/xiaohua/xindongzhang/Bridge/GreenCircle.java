package com.xiaohua.xindongzhang.Bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Green Circle radius: " + radius + " x: " + x + " y:" + y);
	}

}
