package com.xiaolv.test.multipoly;

public class DerivedClass extends BaseClass{
	
	
	

	public static void main(String[] args) {
		
//		BaseClass baseClass = new BaseClass();
		DerivedClass derivedClass = new DerivedClass("1112");
		

	}
	
	
	public DerivedClass(String a) {

		System.err.println("name derived=" + this.getClass().getName());
	}

}
