package com.xiaolv.test.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * toArray can be with parameters to return;
 * no parameters will throw cast exception;
 * 
 * @author charlie
 *
 */
public class ArrayListToArray {

	class InnerClass {
		public InnerClass(String str) {
			
		}
	}
	
	
	List<InnerClass> innerClasses = new ArrayList<ArrayListToArray.InnerClass>();
	
	
	private void testToArray(){
		InnerClass oneClass = new InnerClass("");
		innerClasses.add(oneClass);
		
		InnerClass[] array = (InnerClass[]) innerClasses.toArray();
		
		InnerClass[] array2 = innerClasses.toArray(new InnerClass[innerClasses.size()]);
	}
}
