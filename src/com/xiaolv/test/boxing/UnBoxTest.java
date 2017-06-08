package com.xiaolv.test.boxing;

public class UnBoxTest {
	
	
	
	
	public void int2Long(){
		
		Integer n = 2;
		
		String string = "3";
		
		Long l = Long.valueOf(n); //Integer 可以自动解箱到long
		
		System.out.println("l=" + l);
		
	}
	
	
	
	

	public static void main(String[] args) {

		UnBoxTest unBoxTest = new UnBoxTest();
		unBoxTest.int2Long();
		

	}

}
