package com.demo.test;

import com.demo.linkedlist.SinglyLinkedlist;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		
		SinglyLinkedlist list = new SinglyLinkedlist();
		
		list.add(6);
		list.add(7);
		list.add(5);
		list.add(9);
		list.add(3);
		list.displayAll();
		list.searchByValue(3);
		list.displayAll();
		list.addByValue(2);
		
		list.addByPosition(5,3);
		list.displayAll();
		list.deleteByVlaue(3);
		list.deleteByPosition(0);
		list.displayAll();

	}

}
