package com.xiaolv.test.client;

import com.xiaolv.test.object.SingleInstance;

import sun.security.jca.GetInstance;

/**
 * 经实验多线程调用单例的函数时，不会被阻塞；
 * 单例里面使用静态函数或INSTANCE.普通函数，结果类似；
 * @author Charlie
 *
 */
public class TestSingleInstance {
	
	private static int n = 0;
	
	
//	public static TestSingleInstance INSTANCE = new TestSingleInstance();
//	
//	private TestSingleInstance(){}
//	
//	
//	public static TestSingleInstance getInstance(){
//		return INSTANCE;
//	}
	
	
	
	public static void main(String...args){
		
		//single 
//		for (int i = 0; i < 100; i++) {
//			String str = SingleInstance.INSTANCE.getString("origStr" + (i+200));
//			System.out.println(str);
//		}
		
		//multi-thread
		for (n = 0; n < 5; n++) {
			final Thread t = new Thread(run);
			
			System.out.println("name:" +  t.getName());
			t.start();
		}
	}
	
	//set runnable
	static Runnable run = new Runnable() {
		
		@Override
		public void run() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String str = SingleInstance.INSTANCE.getString(Thread.currentThread().getName()+":" + (n+200));
			System.out.println(str);			
//			String str2 = SingleInstance.INSTANCE.getStringStatic(Thread.currentThread().getName()+":" + (n+200));
//			System.out.println(str2);			
		}
	};
	
	
	
	
	
	
	
	
	
	

}
