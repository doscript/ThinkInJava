package com.xiaolv.test;

import sun.awt.windows.ThemeReader;



public class MakeStackOverFlow {
	
	
	private static int recursiveCnt;
	
	/**
	 * �ݹ���û����stackoverflow�� �������ﶼ����11433��֮����������
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
