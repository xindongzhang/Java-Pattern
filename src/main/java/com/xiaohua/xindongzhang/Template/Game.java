package com.xiaohua.xindongzhang.Template;

public abstract class Game {
	
	abstract void initialize();
	
	abstract void startPlay();
	
	abstract void endPlay();
	
	public final void play() {
		this.initialize();
		this.startPlay();
		this.endPlay();
	}
	
}
