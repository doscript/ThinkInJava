package com.xiaolv.test.memory;

import java.util.ArrayList;

public class MemRegion {

	
	
	
	
	
	static final ArrayList list = new ArrayList(100);

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] bs = new byte[1000000000];
		System.out.println(bs.hashCode());

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bs.hashCode());
		
		
		byte[] bs2 = new byte[500000000];
		System.out.println(bs2.hashCode());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bs.hashCode());
		

	}

}
