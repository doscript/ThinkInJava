package com.xiaolv.test.file;

import java.io.File;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * ����file io
 * @author Charlie
 *
 */
public class FileNew {
	
	private static final String FILEPATH = "D:/aliyun.jpg";
	
	
	/**
	 * Test file �Ƿ��ܶ��new
	 * @param strings
	 */
	
	public static void main(String ...strings){
		
		new Thread(run).start();
		new Thread(run).start();
		new Thread(run).start();
		new Thread(run).start();
		
		
		
	}
	
	static Runnable run = new Runnable() {
		
		@Override
		public void run() {

			File file = new File(FILEPATH);
			try {
				System.out.println("file opened @"+Thread.currentThread().getName());
				
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (file==null || !file.exists()) {
				System.err.println("file not exist");
			}
		}
	};

}
