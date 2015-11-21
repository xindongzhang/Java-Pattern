package com.xiaohua.xindongzhang.State;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("player is in stop state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Stop State";
	}
}
