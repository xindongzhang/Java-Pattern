package com.xiaohua.xindongzhang.FrontController;

public class Dispatcher {
	
	private StudentView studentView;
	
	private HomeView homeView;
	
	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}
	
	public void dispatch(String request) {
		if ( request.equalsIgnoreCase("student") ) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
	
}
