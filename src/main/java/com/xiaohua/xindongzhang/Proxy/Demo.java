package com.xiaohua.xindongzhang.Proxy;

public class Demo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test.jpg");
		
		image.display();
		image.display();
		image.display();
	}

}
