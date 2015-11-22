package com.xiaohua.xindongzhang.FrontController;

public class Demo {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("home");
		frontController.dispatchRequest("student");
	}
}
