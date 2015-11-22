package com.xiaohua.xindongzhang.BusinessDelegate;

public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("JMS service");
	}

}
