package com.xiaohua.xindongzhang.Template;

public class Football extends Game{

	@Override
	void initialize() {
		System.out.println("football initialize");
	}

	@Override
	void startPlay() {
		System.out.println("football start play");
	}

	@Override
	void endPlay() {
		System.out.println("football end play");
	}
	
}
