package com.xiaolv.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SingerInvokeHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("I am invocation handler");
		
		System.out.println("proxy name:" + proxy.getClass().getCanonicalName());
		System.out.println("method cnt:" + proxy.getClass().getMethods().length);
		for (Method m : proxy.getClass().getMethods()) {
			System.out.println("method name:" +m.getName());
		}
		method.invoke(proxy, null);
		return null;
	}
	

}
