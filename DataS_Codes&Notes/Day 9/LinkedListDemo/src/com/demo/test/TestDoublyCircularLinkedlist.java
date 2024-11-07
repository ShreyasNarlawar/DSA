package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;
import com.demo.linkedlist.DublycircularLinkedList;

public class TestDoublyCircularLinkedlist {

	public static void main(String[] args) {
		DublycircularLinkedList dclist=new DublycircularLinkedList();
		dclist.addNode(20);
		dclist.addNode(30);
		dclist.addNode(40);
		dclist.addNode(10);
		dclist.addNode(15);
		dclist.displayData();
		//dclist.deleteByPosition(1);
		//dclist.deleteByPosition(5);
		dclist.deleteByPosition(2);
		dclist.displayData();

	}

}
