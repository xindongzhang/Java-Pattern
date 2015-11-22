package com.xiaohua.xindongzhang.CompositeEntity;

public class CompositeEntity {
	
	private CoarseGrainObject cgo = new CoarseGrainObject();
	
	public void setData(String data1, String data2) {
		this.cgo.setData(data1, data2);
	}
	
	public String[] getData() {
		return cgo.getData();
	}
}
