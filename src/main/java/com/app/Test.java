package com.app;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Test {
private static Logger logger=Logger.getLogger(Test.class);
public static void main(String[] args) {
	Layout layout=new SimpleLayout();
	Appender appender=new ConsoleAppender(layout);
	logger.addAppender(appender);
	logger.debug("hii");
	logger.info("hii");
	logger.warn("hii");
	logger.error("hii");
	logger.fatal("hii");
}
}
