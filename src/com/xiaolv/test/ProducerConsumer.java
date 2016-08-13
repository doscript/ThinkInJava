package com.xiaolv.test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import sun.net.www.content.text.plain;

import com.sun.accessibility.internal.resources.accessibility;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xpath.internal.axes.SelfIteratorNoPredicate;
import com.sun.xml.internal.bind.v2.runtime.Name;

public class ProducerConsumer {
	
	
	class Person {
		String name="xq";
		String gender = "nan";
	}
	
	
	
	class Producer implements Runnable{
		
		private int cnt = 10;
		
		private Person p = null;
		
		public Producer(Person p) {
			this.p = p;
		}
		
		@Override
		public void run() {

			System.out.println("running:" + Thread.currentThread().getName());
			while (true) {
//				System.out.print(cnt + "---");
				synchronized (this) {
					cnt++;
					if (cnt%2==0) {
						p.name = "xq";
						p.gender = "nan";
					}else
					{
						p.name = "xh";
						p.gender = "nv";
					}
					this.notify();
				}
//				name = cnt%3==0?"xq":"xh";
				try {
					TimeUnit.MILLISECONDS.sleep(new Random().nextInt(100));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
//			    gender = cnt%3==0?"nan":"nv";
//			    System.out.println(p.name + ":" + p.gender + "@" + cnt);

			}
		}
		
	} 
	
	class Consumer implements Runnable{
		private int cnt = 10;
		
		private Person p = null;
		
		public Consumer(Person p) {
			this.p = p;
		}
		
		@Override
		public void run() {
			while (true) {
				synchronized (this) {
					try {
						this.wait();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					System.out.println( p.name + ":" + p.gender+ "@" + cnt);
				}
				try {
					TimeUnit.MILLISECONDS.sleep(new Random().nextInt(100));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main( String ... args){
		
		ProducerConsumer wnt = new ProducerConsumer();
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		Person person = wnt.new Person();
		
		Producer myRunA = wnt.new Producer(person);
		new Thread(myRunA).start();
		Consumer myRun2 = wnt.new Consumer(person);
		new Thread(myRun2).start();
		
		
		
	}

}
