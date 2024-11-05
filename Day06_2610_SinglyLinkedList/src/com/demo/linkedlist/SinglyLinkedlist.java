package com.demo.linkedlist;

public class SinglyLinkedlist {
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			
		}
		
	}
	Node head;
	public SinglyLinkedlist() {
		head = null;
	}
	public void add(int val) {
		Node newnode = new Node(val);
		
		if(head == null) {
			head = newnode;
		}else {
			Node temp = head;
			while(temp.next!= null) {
				temp = temp.next;
				
			}
			temp.next = newnode;
			
		}
	}
	public int searchByValue(int val) {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = head;
			int pos = 0;
			
			while(temp != null && temp.data != val) {
				temp = temp.next;
				pos++;
			}
			if(temp != null) {	
				return pos;
			}
		}
		return -1;
		
	}
	public void addByValue(int val) {
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
			System.out.println("the list is empty");
		}
		else {
			Node temp = head;
			while( temp != null && temp.data != val) {
				temp = temp.next;
			}
			if(temp != null) {
				newnode.next = temp.next;
				temp.next = newnode;
			}else {
				System.out.println("Not found");
			}
		}
		
	}
	public void addByPosition(int val,int pos) {
		if(head == null && pos >1) {
			System.out.println("List is empty");
		}
		else {
			Node newnode = new Node(val);
			if(pos == 1) {
				newnode.next = head;
				head = newnode;
			}
			else {
				Node temp = head;
				for(int i =1; temp != null && i <= pos - 2; i++) {
					temp = temp.next;
				}
				if(temp != null) {
					newnode.next = temp.next;
					temp.next = newnode;
				}else {
					System.out.println("Given position is out of limit");
				}
			}
			
		}
	}
	public void deleteByVlaue(int val) {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = head, prev = null;
			if(head.data == val) {
				head= temp.next;
				temp.next = null;
				temp = null;
				
			}
			while(temp != null && temp.data != val) {
				prev = temp;
				temp = temp.next;
			}
			if(temp != null) {
				prev.next = temp.next;
				temp.next = null;
				temp = null;
				
			}else {
				System.out.println("Not found");
			}
		}
		
	}
	public void deleteByPosition(int pos) {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = head;
			Node prev = null;
			
			if(pos == 1) {
				head = temp.next;
				temp.next = null;
				temp = null;
			}else {
				for(int i = 1; temp != null && i <= pos - 1; i++) {
					prev = temp;
					temp = temp.next;
				}
				if(temp != null) {
					temp.next = null;
					temp = null;
				}else {
					System.out.println("Given position is out of bound");
				}
			}
			
			
		}
		
	}
	public void displayAll() {
		if( head == null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = head;
			
			while( temp != null ) {
				System.out.println(temp.data+" ");
				temp = temp.next;
			}
			System.out.println("-------------------------------------------");
		}
		
	}
	
	
	
	
	
	
	
}
