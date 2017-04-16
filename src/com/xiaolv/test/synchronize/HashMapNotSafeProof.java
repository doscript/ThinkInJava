package com.xiaolv.test.synchronize;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.org.apache.bcel.internal.generic.NEW;

import static com.xiaolv.test.util.SystemPrint.*;

/**
 * 
 * @author Charlie
 *
 */
public class HashMapNotSafeProof {
	
	
	HashMap<String, String> hashMap = new HashMap<String, String>();
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			
			int i = 10;
			while (i-->0) {
				
				hashMap.put("zhangirl", "female");
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				hashMap.put("liboy", "male");
				
			}
		}
	};
	
	
	
	
	
	public static void main(String ...args) throws UnsupportedEncodingException{
		HashMapNotSafeProof hashMapNotSafeProof = new HashMapNotSafeProof();
		HashMapNotSafeProof hashMapNotSafeProof2 = new HashMapNotSafeProof();
		
		
	
		printHexString("hashCode1=", String.valueOf(hashMapNotSafeProof.hashCode()));
		printHexString("hashCode2=", String.valueOf(hashMapNotSafeProof2.hashCode()));
		
		
		new Thread( hashMapNotSafeProof.runnable ).start();
		new Thread( hashMapNotSafeProof.runnable ).start();
		new Thread( hashMapNotSafeProof.runnable ).start();
		
		Iterator<Map.Entry<String, String>> entrys = hashMapNotSafeProof.hashMap.entrySet().iterator();
		while (entrys.hasNext()) {
			Map.Entry<String, String> entry = entrys.next();
			System.out.println(entry.getKey()+ "="+entry.getValue());
		}
		
	}
	
	
	

}
