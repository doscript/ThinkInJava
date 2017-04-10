/**
 * 
 */
package com.xiaolv.test.client;

/**
 * @author Charlie
 *
 */
public class TestIntern {

	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = new String("ab");
		String b = new String("ab");
		String c = "ab";
		String d = "a" + "b";
		String e = "b";
		String f = "a" + e;

		System.out.println(String.valueOf(Thread.currentThread().getStackTrace()[1].getLineNumber()) + (b.intern() == a) );
		System.out.println(String.valueOf(Thread.currentThread().getStackTrace()[1].getLineNumber()) + (b.intern() == b) );
		System.out.println(String.valueOf(Thread.currentThread().getStackTrace()[1].getLineNumber()) + (b.intern() == c) );
		System.out.println(String.valueOf(Thread.currentThread().getStackTrace()[1].getLineNumber()) + (b.intern() == d) );
		System.out.println(String.valueOf(Thread.currentThread().getStackTrace()[1].getLineNumber()) + (b.intern() == f) );
		System.out.println(String.valueOf(Thread.currentThread().getStackTrace()[1].getLineNumber()) + (b.intern() == a.intern()) );
		
	}

}
