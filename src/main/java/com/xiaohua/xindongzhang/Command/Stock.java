package com.xiaohua.xindongzhang.Command;

public class Stock {
	
	private String name = "ABC";
	
	private int quantity = 10;
	
	public void buy() {
		System.out.println("buy Name:" + this.name + " quantity:" + this.quantity);
	}
	
	public void sell() {
		System.out.println("sold Name:" + this.name + " quantity:" + this.quantity);
	}
	
}
