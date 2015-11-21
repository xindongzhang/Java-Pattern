package com.xiaohua.xindongzhang.ChainOfResponsibility;

public abstract class AbstractLogger {
	
	public static int INFO  = 1;
	
	public static int DEBUG = 2;
	
	public static int ERROR = 3;

	protected int level;
	
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	/**
	 * 这里使用了递归
	 * @param level
	 * @param message
	 */
	public void logMessage(int level, String message) {
		// 满足条件才触发，否则递归使用
		if ( this.level == level )
			write(message);
		if ( nextLogger != null )
			nextLogger.logMessage(level, message);
	}
	
	abstract protected void write(String message);
}
