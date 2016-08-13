package com.xiaolv.test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.sun.accessibility.internal.resources.accessibility;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xpath.internal.axes.SelfIteratorNoPredicate;
import com.sun.xml.internal.bind.v2.runtime.Name;

public class WaitNotifyConsumer {
	
	
	class MyRun implements Runnable{
		private String mName = null;
		private Object prev = null;
		private Object self = null;
		private int cnt = 30;
		private String name = null;
		private String gender = null;

		@Override
		public void run() {
			
			for (;;){
				System.out.println("for no value no condition");
				if (cnt<0) 
					break;
			}
			
			System.out.println("running:" + Thread.currentThread().getName());
			while (cnt-->0) {
				System.out.print(cnt + "---");
				if (cnt%2==0) {
					name = "xq";
				    gender = "nan";
				}else
				{
					name = "xh";
					gender = "nv";
				}
//				name = cnt%3==0?"xq":"xh";
				try {
					TimeUnit.MILLISECONDS.sleep(new Random().nextInt(100));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
//			    gender = cnt%3==0?"nan":"nv";
				
				
			    System.out.println(name + ":" + gender + "@" + cnt);
			    
			    

			}
		}
		
		public MyRun(String name, Object prev, Object self) {
			this.mName = name;
			this.prev = prev;
			this.self = self;
		}
		
	} 
	
	
	
	public static void main( String ... args){
		
		WaitNotifyConsumer wnt = new WaitNotifyConsumer();
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
