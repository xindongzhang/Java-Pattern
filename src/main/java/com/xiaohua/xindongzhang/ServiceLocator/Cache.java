package com.xiaohua.xindongzhang.ServiceLocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	
	private List<Service> services;
	
	public Cache() {
		services = new ArrayList<>();
	}
	
	public Service getService(String serviceName) {
		for ( Service service: this.services ) {
			if ( service.getName().equalsIgnoreCase(serviceName) ) {
				System.out.println("return cached " + serviceName);
				return service;
			}
		}
		return null;
	}
	
	public void addService(Service newService) {
		boolean exists = false;
		for ( Service service: this.services ) {
			if ( service.getName().equalsIgnoreCase(newService.getName()) ) {
				exists = true;
				break;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}
}
