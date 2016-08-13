package com.xiaolv.test.proxy;

public class SingerStaticProxy {
	
	private Singer singer;
	
	public SingerStaticProxy() {
	}

	public SingerStaticProxy(Singer s) {
		singer = s;
	}
	
	public void sing(){
		System.out.println("i am static proxy");
		singer.sing();
	}

}
