package com.xiaohua.xindongzhang.ServiceLocator;

public class InitialContext {
	
	public Object lookup(String jndiName) {
		if ( jndiName.equalsIgnoreCase("service1") ) {
			System.out.println("looking up and create service1");
			return new Service1();
		} else if ( jndiName.equalsIgnoreCase("service2") ) {
			System.out.println("looking up and create service2");
			return new Service2();
		}
		return null;
	}
	
}
