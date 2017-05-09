package com.xiaolv.test.synchronize;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ProveFieldUnThreadSafe {

	
	private Integer num = 0;
	
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			
			int i = 1000;
			while (i-->0) {
				num = num+1;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+ " num=" + num);
		}
	};
	
	public static void main(String ...strings) {
		new ProveFieldUnThreadSafe().testRun();
		

	}
	
	
	private void testRun(){
		
		new Thread(runnable).start();
		new Thread(runnable).start();
		new Thread(runnable).start();
		
		//尝试等待线程完成
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ret="+num);
		
	}
	
	
}
