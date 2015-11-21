package com.xiaohua.xindongzhang.Template;

public class Cricket extends Game{

	@Override
	void initialize() {
		System.out.println("Cricket initializa");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket start play");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket end play");
	}
	
}
