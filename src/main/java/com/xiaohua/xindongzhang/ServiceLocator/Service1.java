package com.xiaohua.xindongzhang.ServiceLocator;

public class Service1 implements Service {

	@Override
	public String getName() {
		return "service1";
	}

	@Override
	public void execute() {
		System.out.println("executing service1");
	}

}
