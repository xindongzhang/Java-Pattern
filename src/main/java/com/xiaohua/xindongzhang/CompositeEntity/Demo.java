package com.xiaohua.xindongzhang.CompositeEntity;

public class Demo {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.setData("test1", "data1");
		client.printData();
		client.setData("test2", "data2");
		client.printData();
	}
	
}
