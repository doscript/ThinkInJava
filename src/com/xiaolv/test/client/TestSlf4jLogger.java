package com.xiaolv.test.client;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4jLogger {

	
	
	private static final Logger logger = LoggerFactory.getLogger(TestSlf4jLogger.class);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//报No appenders 错误时，只要加上这一句，并且将log4j.properties 放到class目录
		BasicConfigurator.configure();
		
		

		String certEntity = null;
		System.out.println("is certEntity NULL " + (certEntity==null?"yes":"no"));
		logger.info("is certEntity NULL ? " + certEntity==null?"yes":"no");

	}

}
