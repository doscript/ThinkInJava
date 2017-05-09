package com.xiaolv.test.algorithm;

import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.StackConsumer;
import com.sun.org.apache.xml.internal.security.Init;

public class RandomAccuracy {

	
	
	
	//Math.random 还是比较均匀的；
	
	public static void main(String ...args) {
		
		TestMathRandom();
		
	}



	/**
	 * 
	 */
	private static void TestMathRandom() {
		double sum=0;
		
		int len = 100000;
		for (int i = 0; i < len; i++) {
			sum += Math.random();
			
		}
		
		System.out.println("sum average="+sum/len);
	}
}
