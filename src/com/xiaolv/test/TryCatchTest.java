package com.xiaolv.test;

import org.omg.CORBA.TCKind;

/**
 * test try and catch
 * 即使有return，finally也会被执行
 * @author Charlie
 *
 */
public class TryCatchTest {
	
	void testFinally(){
		throw new Error("custom error");
//		int a;
		
	}
	
	
	
	public static void main(String ... args ){
		
		TryCatchTest tc = new TryCatchTest();
		
		try {
			System.out.println("in try1");
			tc.testFinally();
			System.out.println("in try2");
//			return ;
			
		} catch (Error e) {
			System.out.println("in catch");
			return;
		}finally{
			System.out.println("in finally");
		}
		
		return ;
	}
}
