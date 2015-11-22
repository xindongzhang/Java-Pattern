package com.xiaohua.xindongzhang.ServiceLocator;

public class Service2 implements Service {

	@Override
	public String getName() {
		return "service2";
	}

	@Override
	public void execute() {
		System.out.println("executing service2");
	}

}
