package com.xiaolv.test.client;

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		new InnerClass();
		InnerClassTest o = new InnerClassTest();
		
		o.new InnerClass();

	}
	
	
	
	public class InnerClass {
		
		
	}
	
	
	public class InnerClass2{
		
	}
	
	
	public void otherMethod(){
		new InnerClass();
		
	}
	
	
	
	InnerClass innerClass = new InnerClass();
	
	
	

}
