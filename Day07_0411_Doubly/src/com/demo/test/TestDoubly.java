package com.demo.test;

import com.demo.linkedlist.DoublyLinkedlist;

public class TestDoubly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedlist dlst = new DoublyLinkedlist();
		
		dlst.addNode(6);
		dlst.addNode(5);
		dlst.addNode(8);
		
		dlst.displayAll();
		
		dlst.deleteByPosition(2);
		dlst.displayAll();
		
		dlst.addByPosition(5,3);
		dlst.displayAll();
		dlst.displayAll();
		
		int data = dlst.searchByPosition(1);
		if(data == -1) {
			System.out.println("Position not found");
		}
		else
			System.out.println(data+"-> Value found at Entered position..");
		
		dlst.displayAll();
		
		dlst.addBeforeValue(5,3);
		dlst.displayAll();
		
		dlst.addAfterValue(8,9);
		dlst.displayAll();
		
		//dlst.displayInReverse();
		
	}

}
