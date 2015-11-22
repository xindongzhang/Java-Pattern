package com.xiaohua.xindongzhang.Intercepting;

public class Client {
	
	private FilterManager filterManager;
	
	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}
	
	public void sendRequest(String request) {
		this.filterManager.filterRequest(request);
	}
}
