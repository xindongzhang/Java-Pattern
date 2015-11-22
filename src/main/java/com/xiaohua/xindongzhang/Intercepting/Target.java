package com.xiaohua.xindongzhang.Intercepting;

public class Target {
	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}
