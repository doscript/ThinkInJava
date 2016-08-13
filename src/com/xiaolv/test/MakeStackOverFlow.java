package com.xiaolv.test;

import sun.awt.windows.ThemeReader;



public class MakeStackOverFlow {
	
	
	private static int recursiveCnt;
	
	/**
	 * 递归调用会产生stackoverflow， 而且这里都是在11433次之后产生溢出；
	 */
    public void recursivePrint() {
	        recursiveCnt ++;
	        recursivePrint();
	    }
	

	public static void main(String[] args) {
		
		MakeStackOverFlow msof = new MakeStackOverFlow();
		
		try {
			msof.recursivePrint();
		} catch (StackOverflowError e) {
			System.out.println("last number is " + recursiveCnt);
			e.printStackTrace();
			return;
		}

	}
	
	

}
