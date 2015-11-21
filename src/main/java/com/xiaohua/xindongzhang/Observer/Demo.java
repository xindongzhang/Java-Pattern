package com.xiaohua.xindongzhang.Observer;

public class Demo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		subject.setState(15);
	}

}
