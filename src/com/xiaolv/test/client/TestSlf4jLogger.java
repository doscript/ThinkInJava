package com.xiaolv.test.client;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4jLogger {

	
	
	private static final Logger logger = LoggerFactory.getLogger(TestSlf4jLogger.class);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//��No appenders ����ʱ��ֻҪ������һ�䣬���ҽ�log4j.properties �ŵ�classĿ¼
		BasicConfigurator.configure();
		
		

		String certEntity = null;
		System.out.println("is certEntity NULL " + (certEntity==null?"yes":"no"));
		logger.info("is certEntity NULL ? " + certEntity==null?"yes":"no");

	}

}
