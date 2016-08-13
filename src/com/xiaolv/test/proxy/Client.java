package com.xiaolv.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

public class Client {
	
	public static void main(String ...strings ){
		System.out.println("I am client, I want to listen");
		
		Singer singer =  new Singer();
		singer.sing();
		
		//静态
		SingerStaticProxy singerStaticProxy = new SingerStaticProxy(singer); //proxy 要传入 真实类的对象
		singerStaticProxy.sing();
		
		//动态
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
		
		//api 动态
		InvocationHandler iHandler = new SingerInvokeHandler();
		SingerApiProxy sap = new SingerApiProxy(iHandler);
		sap.sing();
	}

}
