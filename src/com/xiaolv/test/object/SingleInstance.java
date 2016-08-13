package com.xiaolv.test.object;

/**
 * �����Ƿ�����������ĵ����Ƿ���Եȴ�
 * @author Charlie
 *
 */
public class SingleInstance {

	private static int calledCnt = 0;
	
	public static SingleInstance INSTANCE = new SingleInstance();
	
	private SingleInstance(){
		
	}
	
	public String getString(String in){
		
//		calledCnt++;
		System.out.println("before sleep:" + in);
		String out = null;
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		out = in;
		
		return (calledCnt++)+ ":" + out;
	}
	
	public static synchronized String getStringStatic(String in){
		
//		calledCnt++;
		System.out.println("before sleep:" + in);
		String out = null;
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		out = in;
		
		return (calledCnt++)+ ":" + out;
	}
	
}
