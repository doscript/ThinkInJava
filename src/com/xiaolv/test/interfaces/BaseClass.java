package com.xiaolv.test.interfaces;

public class BaseClass {

	
	public BaseClass() {
		// TODO Auto-generated constructor stub
	}
	
    int number = 3;
	
	//This instance method cannot override the static method from BaseClass
    //���󷽷��������ػ���ľ�̬����
//	static void finalMethod(){
//		System.out.println("finalMethod in base");
//	}
    
    static final void finalMethod(){};
	
	public BaseClass aMethod(){
		return this;
	}
	
}

//class SameDedrivedCls extends BaseClass{
//	
//	
//	
//	SameDedrivedCls(int a) {
//		// TODO Auto-generated constructor stub
//	}
//}
