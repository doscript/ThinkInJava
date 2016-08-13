package com.xiaolv.test;

public class LogicAndOrPriority {
	
	public static void main(String ... args){
		
		int [] cons = {0,1,2,3,4,5,6};
		
		if (cons[0]==0 && cons[1]==1) {
			System.out.println("bingo 1");
		}
		
		if (cons[0]==0 && cons[1]==2
				||cons[2]==2 && cons[3]==3) { //
			System.out.println("bingo 2");
		}
	}

}
