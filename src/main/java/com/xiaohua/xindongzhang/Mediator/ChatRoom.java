package com.xiaohua.xindongzhang.Mediator;

import java.util.Date;

public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " user:" + user.getName() + " " + message);
	}
}
