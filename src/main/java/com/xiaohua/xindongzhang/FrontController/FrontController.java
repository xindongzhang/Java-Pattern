package com.xiaohua.xindongzhang.FrontController;

public class FrontController {
	
	private Dispatcher dispatcher;
	
	public FrontController() {
		dispatcher = new Dispatcher();
	}
	
	private boolean isAuthenticUser() {
		System.out.println("User is authenticated successfully");
		return true;
	}
	
	private void trackRequest(String request) {
		System.out.println("page requested: " + request);
	}
	
	public void dispatchRequest(String request) {
		trackRequest(request);
		if ( isAuthenticUser() ) {
			dispatcher.dispatch(request);
		}
	}
}
