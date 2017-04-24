package com.xiaolv.test.datastructure.entity;

/**
 * node for single list
 * @author Charlie
 *
 */
public class MySingleListNode {
	
	int data;
	MySingleListNode next;
	

	public MySingleListNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public MySingleListNode getNext() {
		return next;
	}
	
	public void setNext(MySingleListNode next) {
		this.next = next;
	}
}
