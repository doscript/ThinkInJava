package com.xiaolv.test.datastructure.linklist;

import com.xiaolv.test.datastructure.entity.MySingleListNode;

public class ReverseSingleLinklist {
	
	
	
	
	public static void main(String ...strings){
		
		
		MySingleListNode mySingleListNode1 = new MySingleListNode(1);
		MySingleListNode mySingleListNode2 = new MySingleListNode(2);
		MySingleListNode mySingleListNode3 = new MySingleListNode(3);
		MySingleListNode mySingleListNode4 = new MySingleListNode(4);
		
		mySingleListNode1.setNext(mySingleListNode2);
		mySingleListNode2.setNext(mySingleListNode3);
		mySingleListNode3.setNext(mySingleListNode4);
		
		MySingleListNode cursorNode = mySingleListNode1;
		
//		reversedValueByArray(mySingleListNode1, cursorNode);
		
		
		cursorNode = reverseRecursive(mySingleListNode1);
		//��ӡ����֮���
		System.out.println("after reversed:");
		while(cursorNode.getNext()!=null){
			System.out.print(cursorNode.getData()+"\t");
			cursorNode = cursorNode.getNext();
		}
		System.out.println(cursorNode.getData());
		
		
		
	}
	
	
    /** 
     * �ݹ飬�ڷ�ת��ǰ�ڵ�֮ǰ�ȷ�ת�����ڵ� 
     */  
    public static MySingleListNode reverseRecursive(MySingleListNode head) {  
        // head������ǰһ��㣬head.getNext()�ǵ�ǰ��㣬reHead�Ƿ�ת���������ͷ���  
        if (head == null || head.getNext() == null) {  
            return head;// ��Ϊ�������ߵ�ǰ�����β��㣬��ֱ�ӻ���  
        }  
        MySingleListNode reHead = reverseRecursive(head.getNext());// �ȷ�ת�����ڵ�head.getNext()  
        head.getNext().setNext(head);// ����ǰ����ָ����ָ��ǰһ���  
        head.setNext(null);// ǰһ����ָ������Ϊnull;  
        return reHead;// ��ת���������ͷ���  
    }

	/**
	 * @param mySingleListNode1
	 * @param cursorNode
	 */
	private static void reversedValueByArray(MySingleListNode mySingleListNode1, MySingleListNode cursorNode) {
		//��ӡ����ȡ������
		System.out.println("orig list:");
		int listLength = 1;
		while(cursorNode.getNext()!=null) {
			System.out.print(cursorNode.getData()+"\t");
			cursorNode = cursorNode.getNext();
			listLength++;
		}
		System.out.println(cursorNode.getData()+"");
		System.out.println("len="+listLength);
		
		//ʹ���������洢ֵ
		int a[] = new int[listLength];
		cursorNode = mySingleListNode1; //��ԭcursor
		int indexA = 0;
		while(cursorNode.getNext()!=null) {
			a[indexA] = cursorNode.getData();
			indexA++;
			cursorNode = cursorNode.getNext();
		}
		a[indexA] = cursorNode.getData();
		
		//ʹ���������������ֵ
		cursorNode = mySingleListNode1; //��ԭcursor
		while(cursorNode.getNext()!=null){
			cursorNode.setData(a[indexA]);
			indexA--;
			cursorNode=cursorNode.getNext();
		}
		cursorNode.setData(a[indexA]);
		
		
		//��ӡ����֮���
		System.out.println("after reversed:");
		cursorNode = mySingleListNode1; //��ԭcursor
		while(cursorNode.getNext()!=null){
			System.out.print(cursorNode.getData()+"\t");
			cursorNode = cursorNode.getNext();
		}
	    System.out.println(cursorNode.getData());
	}

}
