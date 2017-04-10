package com.xiaolv.test.defaultvalue;

public class DefaultValue {
	
	
	
	
	
	
	
	/**
	 * 形参默认值，形参必须要传值
	 * @param args
	 */
	int formalParams(int n){
		
		System.out.println("int=" + n);
		
		return 0;
	}
	
	
	
	public static void main(String ... args){
	
		DefaultValue defaultValue = new DefaultValue();
	}

}
