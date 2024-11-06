package com.demo.test;

import com.demo.linkedlist.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList clist=new CircularLinkedList();
		clist.addNode(23);
		clist.addNode(25);
		clist.addNode(30);
		clist.addNode(40);
		clist.displaydata();
		clist.addByPosition(100, 1);
		clist.displaydata();
		clist.addByPosition(200, 3);
		clist.displaydata();
		clist.addByPosition(300, 7);
		clist.displaydata();
		clist.addByPosition(200, 10);
		clist.displaydata();


	}

}
