package com.demo.linkedlist;

public class DoublyLinkedlist {
	class Node{
		int data;
		Node next;
		public Node prev;
		
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	Node head;

	public void addNode(int val) {
		// TODO Auto-generated method stub
		Node newnode = new Node(val);
		if(head == null)
			head = newnode;
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.prev = temp;
			
		}
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		Node temp = head;
		if(head != null) {
			while( temp != null ) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		System.out.println("-------------------------------------------------------------------");
	}

	public void deleteByPosition(int pos) {
		// TODO Auto-generated method stub
		Node temp = head;
		if( pos == 1) {
			if(head != null) {
				temp = head;
				head = head.next;
					if(temp.next != null)
						temp.next.prev = null;
				temp.next = null;
				temp = null; 		
			}else
				System.out.println("position beyond limit");
		}else {
				for(int i = 1; temp != null && i <= pos - 1; i++) {
					temp = temp.next;
				}
				if(temp != null) {
					temp.prev.next = temp.next;
					if(temp.next != null)
						temp.next.prev = temp.prev;		
				}
				temp.next = null;
				temp.prev = null;
				temp = null;		
		}
	}

	public void addByPosition(int val, int pos) {
		// TODO Auto-generated method stub
		Node newnode = new Node(val);
		if(pos == 1) {
			if(head == null) {
				head = newnode;
			}else {
				newnode.next = head;
				head.prev = newnode;
				head = newnode;
			}
		}else {
			Node temp = head;
			for(int i = 1; temp != null && i <= pos -2; i++) {
			   temp = temp.next;
			}
			if(temp == null) {
				System.out.println("Given position not available");
			}else
				newnode.next = temp.next;
			if(temp.next != null) {
				temp.next.prev = newnode;
			}
			newnode.prev = temp;
			temp.next = newnode;
		}
	}

	public int searchByPosition(int pos) {
		// TODO Auto-generated method stub
	    Node temp = head;
		int count = 1;
		while(temp != null && count < pos) {
				temp = temp.next;
				count ++;
			}
		if(temp != null && count == pos) {
			return temp.data;
		}
		return -1;
	}

	public void addBeforeValue(int oldval, int newval) {
		// TODO Auto-generated method stub
		Node newnode = new Node(newval);
		Node temp = head;
		Node prev = null;
		while(temp != null && temp.data != oldval) {
			temp = temp.next;
			prev = temp;
		}
		if(temp != null) {
			prev.next = newnode;
			newnode.next = temp;
			temp = temp.next;
			
		}

		
	}
}
