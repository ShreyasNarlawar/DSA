package com.demo.linkedlist;

public class Circularlinkedlist {
	Node head,tail;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}	
	}
	
	public Circularlinkedlist() {
		head = null;
		tail = null;
	}

	public void addNode(int val) {
		// TODO Auto-generated method stub
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
			tail = newnode;
		}
		else {
			tail.next = newnode;
			tail = newnode;	
		}
		tail.next = head;
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = head;
			while(temp.next != head) {
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println(temp.data);
			
		}
		System.out.println("---------------------------------------------------------");
		
	}

	public void addByPosition(int val, int pos) {
		// TODO Auto-generated method stub
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
		}
		else {
			if(pos == 1) {
				newnode.next = head;
				head = newnode;
				tail.next = newnode;
			}
			else {
				Node temp = head;
				int i = 1;
				for(; temp.next != head && i <= pos -2; i++) {
					temp = temp.next;
				}
				if(i > pos -2) {
					if(temp.next == head) {
						tail = newnode;
					}
					newnode.next = temp.next;
					temp.next = newnode;
				}else {
					System.out.println("Beyond limit");
				}
			}
		}
		
	}

	public void deleteByPosition(int pos) {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			Node temp = head;
			Node prev = null;
			if(pos == 1) {
				tail.next = temp.next;
				head = temp.next;
				head.next = null;
				head = null;
		   }
			else {
				for(int i = 1; temp != null && i <= pos -1; i++) {
					prev = temp;
					temp = temp.next;
				}
				
				if(temp != null) {
					prev.next = temp.next;
					tail.next = head;
					temp.next = null;
					temp = null;
				}else {
					System.out.println("Not found");
				}
			}
		}
		
	}

	public void addByValue(int val) {
		// TODO Auto-generated method stub
		Node newnode = new Node(val);
		
		if(head.data == val) {
			head = newnode;
			newnode.next = head.next;
			tail.next = newnode;
		}
		else {
			Node temp = head;
			
			while(temp != null && temp.data != val) {
				temp = temp.next;
			}
			
			if(temp != null) {
				temp = newnode;
				newnode.next = temp.next;
				tail.next = head;
				
			}
		}
	}
	
	
	

}
