package com.xiaohua.xindongzhang.ChainOfResponsibility;

public class Demo {

	private static AbstractLogger getChainOfLogger() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger  = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLogger();
		loggerChain.logMessage(AbstractLogger.INFO, "this is an information");
		loggerChain.logMessage(AbstractLogger.DEBUG, "this is an debug information");
		loggerChain.logMessage(AbstractLogger.ERROR, "this is an error information");
	}

}
