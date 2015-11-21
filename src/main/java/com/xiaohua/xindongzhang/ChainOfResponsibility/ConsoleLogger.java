package com.xiaohua.xindongzhang.ChainOfResponsibility;

public class ConsoleLogger extends AbstractLogger{

	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("standard console::logger:" + message);
	}

}
