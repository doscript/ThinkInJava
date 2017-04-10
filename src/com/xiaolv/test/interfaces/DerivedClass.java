package com.xiaolv.test.interfaces;




class DerivedClass extends BaseClass {
	
	

	public static void main(String[] args) {
		new DerivedClass().notFinalMethod();
	}
	
	
	
	void notFinalMethod(){
		number++;
		System.out.println("number=" + number);
	}

	
	//
//	static void finalMethod(){
//		System.out.println("static method in DerivedClass");
//	}
	
	//Cannot override the final method from BaseClass
	// final 类方法和实例方法都不能被覆盖；
	// 静态方法可以被覆盖成静态方法；
//	static final void finalMethod(){};
	
	
	//The return type is incompatible with BaseClass.aMethod()
	//覆盖时，返回类型不能不一致；
	//public void aMethod(){};
	//private void aMethod(){};
	
	
	//Cannot reduce the visibility of the inherited method from BaseClass
	//覆盖时，可见性不能降低；
	//private DerivedClass aMethod(){};
	//private BaseClass aMethod(){};
	
	
	
	
}
