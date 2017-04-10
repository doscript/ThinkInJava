package com.xiaolv.test.client;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestSleepTime implements Runnable {

	
//	ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 10, TimeUnit.SECONDS, null);

	public void sleepTimeTest(  ){
		for (int i=0;i<10;i++){
//			threadPoolExecutor.execute(new TestSleepTime());
			new Thread(new TestSleepTime()).start();
		}
	}
	

	@Override
	public void run() {
		
		long initialTime = System.nanoTime();
//		long initialTime = System.currentTimeMillis();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long afterTime = System.nanoTime();
		
		long usingTime = afterTime  - initialTime;
		
		System.out.println(Thread.currentThread().getName() +  ": sleeped time= "  + usingTime);
	}
	
	public static void main(String[] args) {
		
		new TestSleepTime().sleepTimeTest();

	}



}
