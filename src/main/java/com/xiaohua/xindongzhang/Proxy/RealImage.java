package com.xiaohua.xindongzhang.Proxy;

public class RealImage implements Image {

	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		this.loadFromDisk(fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Load image:" + fileName);
	}
	
	@Override
	public void display() {
		System.out.println("Displaying image:" + fileName);
	}

}
