package com.xiaolv.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

public class Client {
	
	public static void main(String ...strings ){
		System.out.println("I am client, I want to listen");
		
		Singer singer =  new Singer();
		singer.sing();
		
		//��̬
		SingerStaticProxy singerStaticProxy = new SingerStaticProxy(singer); //proxy Ҫ���� ��ʵ��Ķ���
		singerStaticProxy.sing();
		
		//��̬
		SingerDynamicProxy singerDynamicProxy = new SingerDynamicProxy();
		try {
			singerDynamicProxy.sing();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		//api ��̬
		InvocationHandler iHandler = new SingerInvokeHandler();
		SingerApiProxy sap = new SingerApiProxy(iHandler);
		sap.sing();
	}

}
