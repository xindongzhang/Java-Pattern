package com.xiaohua.xindongzhang.Mediator;

public class Demo {

	public static void main(String[] args) {
		
		User robert = new User("robert");
		User john   = new User("john");
		
		robert.sendMessage("hi, john");
		john.sendMessage("hello! robert");
		
	}

}
