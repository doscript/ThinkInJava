package com.xiaolv.test.client;

public class TestStatic {

	
	static int i = 0;
	
	public int a(){
		
		i++;
		return i;
	}
	
	
	public static void main(String ...strings){
		
		TestStatic testStatic = new TestStatic();
		
//		testStatic.a();
		
		int j= testStatic.a();
		
		System.out.println(j);
	}
}
