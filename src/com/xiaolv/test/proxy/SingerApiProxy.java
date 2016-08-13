package com.xiaolv.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SingerApiProxy extends Proxy{

	private InvocationHandler handler;
	private Class cls;
	
	protected SingerApiProxy(InvocationHandler h) {
		super(h);
		handler = h;
	}
	
	public void sing(){
		cls = Singer.class; //ί����
		System.out.println("\nI am api proxy, extends proxy");
		try {
			handler.invoke(cls.newInstance(), cls.getMethod("sing", null), null); //ί�������
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
