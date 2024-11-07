package com.demo.test;

import com.demo.linkedlist.DoublyCircular;

public class TestDoublyCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyCircular dclst = new DoublyCircular();
		
		dclst.addNode(5);
		dclst.addNode(10);
		dclst.addNode(4);
		dclst.addNode(7);
		dclst.addNode(9);
		dclst.addNode(16);
		dclst.addNode(13);
		
		dclst.displayAll();
		
		dclst.deleteByPosition(3);
		dclst.displayAll();
	}

}
