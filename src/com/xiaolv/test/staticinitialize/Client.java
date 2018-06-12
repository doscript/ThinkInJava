package com.xiaolv.test.staticinitialize;

public class Client {

	public static void main(String[] args) {
		
		//经实验验证，只要执行类中的一个静态函数，该类中所有的静态块都会执行，但不会执行构造函数；

		//System.out.println("in main=" + TestStaticBlock.testFunc());
		
		System.out.println("I am not calling any other......");

	}

}
