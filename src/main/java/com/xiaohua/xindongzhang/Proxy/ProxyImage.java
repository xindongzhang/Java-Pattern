package com.xiaohua.xindongzhang.Proxy;

public class ProxyImage implements Image {

	private String fileName;
	
	private RealImage realImage;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		if ( realImage  == null ) {
			realImage = new RealImage(fileName);
			System.out.println("create real image");
		}
		realImage.display();
	}

}
