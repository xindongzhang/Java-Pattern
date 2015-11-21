package com.xiaohua.xindongzhang.Strategy;

public class Demo {

	public static void main(String[] args) {
		Context context1 = new Context(new OperationAdd());
		System.out.println(context1.execute(10, 5));
		Context context2 = new Context(new OperationSubstract());
		System.out.println(context2.execute(10, 5));
	}

}
