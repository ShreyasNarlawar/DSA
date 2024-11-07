package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;

public class TestDoublyLinkedList {
public static void main(String[] args) {
	DoublyLinkedList dlist=new DoublyLinkedList();
	dlist.addNode(2);
	dlist.addNode(3);
	dlist.addNode(5);
	dlist.addNode(1);
	dlist.addNode(10);
	dlist.displayData();
	dlist.displayDatainReverseOrder();
	dlist.addBeforeKey(11,1);
	dlist.displayData();
	dlist.addBeforeKey(100,2);
	dlist.displayData();
	dlist.addAfterKey(33,10);
	dlist.displayData();
	dlist.deleteByPosition(2);
}
}
