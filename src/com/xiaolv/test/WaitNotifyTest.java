package com.xiaolv.test;

import java.util.concurrent.TimeUnit;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xpath.internal.axes.SelfIteratorNoPredicate;
import com.sun.xml.internal.bind.v2.runtime.Name;

public class WaitNotifyTest {
	
	
	class MyRun implements Runnable{
		private String mName = null;
		private Object prev = null;
		private Object self = null;
		private int cnt = 10;

		@Override
		public void run() {

//			System.out.println("running:" + Thread.currentThread().getName());
			while (cnt-->0) {
//				synchronized (prev) {
//					try {
//						prev.wait();
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
					System.out.print(this.mName);
//					self.notify();
//				}
				try {
					TimeUnit.MILLISECONDS.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		public MyRun(String name, Object prev, Object self) {
			this.mName = name;
			this.prev = prev;
			this.self = self;
		}
		
	} 
	
	
	
	public static void main( String ... args){
		
		WaitNotifyTest wnt = new WaitNotifyTest();
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		
		MyRun myRunA = wnt.new MyRun("A",c,a);
		MyRun myRunB = wnt.new MyRun("B",a,b);
		MyRun myRunC = wnt.new MyRun("C",b,c);
		new Thread(myRunA).start();
		new Thread(myRunB).start();
		new Thread(myRunC).start();
		
		
		
	}

}
