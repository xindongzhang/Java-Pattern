package com.xiaohua.xindongzhang.BusinessDelegate;

public class Client {
	
	BusinessDelegate businessService;
	
	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}
	
	public void doTask() {
		this.businessService.doTask();
	}
	
}
