package com.xiaolv.test.client;

import com.xiaolv.test.object.SingleInstance;

/**
 * 经实验多线程调用单例的函数时，不会被阻塞；
 * 单例里面使用静态函数或INSTANCE.普通函数，结果类似；
 * @author Charlie
 *
 */
public class TestSingleInstance {
	
	private static int n = 0;
	
	public static void main(String...args){
		System.out.println();
		
		//在同一个线程里调用，串行执行；
//		for (int i = 0; i < 100; i++) {
//			String str = SingleInstance.INSTANCE.getString("origStr" + (i+200));
//			System.out.println(str);
//		}
		
		//多线程调用时的情形
		for (n = 0; n < 100; n++) {
			final Thread t = new Thread(run);
			
			System.out.println("name:" +  t.getName());
			t.start();
		}
	}
	
	//set runnable
	static Runnable run = new Runnable() {
		
		@Override
		public void run() {
			final int fn= 10;
			String str = SingleInstance.INSTANCE.getString("origStr" + (n+200));
			System.out.println(str);			
		}
	};
}
