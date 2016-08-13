package com.xiaolv.test;

public class RecursiveFunc {

	
	
	//n!
	int factorial(int n){
		if(n==1)
			return 1;
		else {
			return n*factorial(n-1);
		}
	}
	
	// 1 1 2 3 5 8 13 21 ....
	int fibonachi(int n){
		if(n<=0) return -1;
		else if (n<3) {
			return 1;
		}else {
			return fibonachi(n-1)+factorial(n-2);
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String ...args){
		System.err.println("factorial =" + (new RecursiveFunc()).factorial(3));
		System.err.println("fibonachi =" + (new RecursiveFunc()).fibonachi(6));
	}
}
