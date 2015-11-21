package com.xiaohua.xindongzhang.Singleton;

public class SingleObject {
	
	private static volatile SingleObject instance;
	
	public static SingleObject getInstance() {
		if (instance == null) {
			synchronized(SingleObject.class) {
				if (instance == null) {
					instance = new SingleObject();
					System.out.println("单例初始化");
				}
			}
		}
		return instance;
	}
	
	public static void main(String args[]) {
		// 仅仅初始化一次
		for (int i = 0; i < 10; ++i) {
			SingleObject.getInstance();
		}
	}
	
}
