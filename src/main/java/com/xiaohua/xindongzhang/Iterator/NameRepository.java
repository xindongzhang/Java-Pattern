package com.xiaohua.xindongzhang.Iterator;

public class NameRepository implements Container {

	public String names[] = {"xindongzhang", "hefang", "xiaohua"};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {

		int idx = 0;
		
		@Override
		public boolean hasNext() {
			if ( idx < names.length ) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if ( this.hasNext() ) {
				return names[idx++];
			}
			return null;
		}
		
	}

}
