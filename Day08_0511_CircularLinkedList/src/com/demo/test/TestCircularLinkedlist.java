package com.demo.test;

import com.demo.linkedlist.Circularlinkedlist;

public class TestCircularLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circularlinkedlist clst = new Circularlinkedlist();
		
		clst.addNode(6);
		clst.addNode(7);
		clst.addNode(9);
		clst.addNode(3);
		clst.displayAll();
		
//		clst.addByPosition(11,0);
//		clst.displayAll();
		
		clst.deleteByPosition(1);
		clst.displayAll();
		
//		clst.addByValue(3);
		
		
	}

}
