package com.xiaohua.xindongzhang.Visitor;

public class Computer implements ComputerPart {

	private ComputerPart[] parts;
	
	public Computer() {
		parts = new ComputerPart[] {
			new Mouse(),
			new KeyBoard(),
			new Monitor()
		};
	}
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i = 0; i < this.parts.length; ++i) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
