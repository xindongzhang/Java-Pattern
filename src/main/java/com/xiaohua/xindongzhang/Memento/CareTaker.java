package com.xiaohua.xindongzhang.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Memento> mementoList = new ArrayList<>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	public Memento get(int idx) {
		return mementoList.get(idx);
	}
	
}
