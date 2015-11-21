package com.xiaohua.xindongzhang.NullObject;

public class Demo {

	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("null");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
	}

}
