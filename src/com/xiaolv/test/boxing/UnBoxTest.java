package com.xiaolv.test.boxing;

public class UnBoxTest {
	
	
	
	
	public void int2Long(){
		
		Integer n = 2;
		
		String string = "3";
		
		Long l = Long.valueOf(n); //Integer �����Զ����䵽long
		
		System.out.println("l=" + l);
		
	}
	
	
	
	

	public static void main(String[] args) {

		UnBoxTest unBoxTest = new UnBoxTest();
		unBoxTest.int2Long();
		

	}

}
