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
		//打印逆序之后的
		System.out.println("after reversed:");
		while(cursorNode.getNext()!=null){
			System.out.print(cursorNode.getData()+"\t");
			cursorNode = cursorNode.getNext();
		}
		System.out.println(cursorNode.getData());
		
		
		
	}
	
	
    /** 
     * 递归，在反转当前节点之前先反转后续节点 
     */  
    public static MySingleListNode reverseRecursive(MySingleListNode head) {  
        // head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点  
        if (head == null || head.getNext() == null) {  
            return head;// 若为空链或者当前结点在尾结点，则直接还回  
        }  
        MySingleListNode reHead = reverseRecursive(head.getNext());// 先反转后续节点head.getNext()  
        head.getNext().setNext(head);// 将当前结点的指针域指向前一结点  
        head.setNext(null);// 前一结点的指针域令为null;  
        return reHead;// 反转后新链表的头结点  
    }

	/**
	 * @param mySingleListNode1
	 * @param cursorNode
	 */
	private static void reversedValueByArray(MySingleListNode mySingleListNode1, MySingleListNode cursorNode) {
		//打印并获取链表长度
		System.out.println("orig list:");
		int listLength = 1;
		while(cursorNode.getNext()!=null) {
			System.out.print(cursorNode.getData()+"\t");
			cursorNode = cursorNode.getNext();
			listLength++;
		}
		System.out.println(cursorNode.getData()+"");
		System.out.println("len="+listLength);
		
		//使用数组来存储值
		int a[] = new int[listLength];
		cursorNode = mySingleListNode1; //还原cursor
		int indexA = 0;
		while(cursorNode.getNext()!=null) {
			a[indexA] = cursorNode.getData();
			indexA++;
			cursorNode = cursorNode.getNext();
		}
		a[indexA] = cursorNode.getData();
		
		//使用逆序的数组设置值
		cursorNode = mySingleListNode1; //还原cursor
		while(cursorNode.getNext()!=null){
			cursorNode.setData(a[indexA]);
			indexA--;
			cursorNode=cursorNode.getNext();
		}
		cursorNode.setData(a[indexA]);
		
		
		//打印逆序之后的
		System.out.println("after reversed:");
		cursorNode = mySingleListNode1; //还原cursor
		while(cursorNode.getNext()!=null){
			System.out.print(cursorNode.getData()+"\t");
			cursorNode = cursorNode.getNext();
		}
	    System.out.println(cursorNode.getData());
	}

}
