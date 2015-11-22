package com.xiaohua.xindongzhang.TransferObject;

public class StudentVO {
	
	private String name;
	
	private int rollNo;
	
	public StudentVO(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
