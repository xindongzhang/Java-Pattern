package com.xiaohua.xindongzhang.Intercepting;

public class AuthenticationFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("Authentication request: " + request);
	}

}
