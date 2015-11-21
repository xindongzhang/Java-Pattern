package com.xiaohua.xindongzhang.Iterator;

public class Demo {

	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		Iterator iter = nameRepository.getIterator();
		while(iter.hasNext()) {
			System.out.println((String)iter.next());
		}
	}

}
