package com.xiaohua.xindongzhang.BusinessDelegate;

public class BusinessDelegate {
	
	private BusinessLookUp lookupService = new BusinessLookUp();
	
	private BusinessService businessService;
	
	private String serviceType;
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public void doTask() {
		this.businessService = this.lookupService.getBusinessService(serviceType);
		this.businessService.doProcessing();
	}
	
}
