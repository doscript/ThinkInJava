package com.xiaolv.test.staticinitialize;

import org.omg.CORBA.PUBLIC_MEMBER;

import jdk.internal.dynalink.beans.StaticClass;

public class TestStaticBlock {
	
	
	public static String str;
	
	static {
		str = "in static block";
	}
	
	
	static {
		System.out.println("I am buying some sauce....");
	}
	
	public static String testFunc() {
		System.out.println("testFunc str=" + str);
		return "testFunc str=" + str;
		
	}
	
	public TestStaticBlock(){
		System.out.println("constructed.....");
	}
	
	
	static {
		System.out.println("I am buying some sauce again!!!....");
	}

}
