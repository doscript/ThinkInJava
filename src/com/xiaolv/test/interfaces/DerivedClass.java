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
	// final �෽����ʵ�����������ܱ����ǣ�
	// ��̬�������Ա����ǳɾ�̬������
//	static final void finalMethod(){};
	
	
	//The return type is incompatible with BaseClass.aMethod()
	//����ʱ���������Ͳ��ܲ�һ�£�
	//public void aMethod(){};
	//private void aMethod(){};
	
	
	//Cannot reduce the visibility of the inherited method from BaseClass
	//����ʱ���ɼ��Բ��ܽ��ͣ�
	//private DerivedClass aMethod(){};
	//private BaseClass aMethod(){};
	
	
	
	
}
