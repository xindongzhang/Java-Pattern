package com.xiaohua.xindongzhang.BusinessDelegate;

public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("EJB service");
	}

}
