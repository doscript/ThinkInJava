package com.xiaolv.test.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class SingerDynamicProxy {
	
	public void sing() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Class clsSinger = Singer.class;
		
		System.out.println("I am SingerDynamicProxy");
		Method method = clsSinger.getMethod("sing", null);
		
		
		try {
			method.invoke(clsSinger.newInstance(), null); //invoke first param 得是委托类对象
			method.invoke(new Singer(), null);
			method.invoke(((Singer.class)).newInstance(), null);
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}

}
