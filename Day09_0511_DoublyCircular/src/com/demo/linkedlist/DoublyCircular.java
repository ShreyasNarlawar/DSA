package com.demo.linkedlist;

public class DoublyCircular {
	Node head;
	class Node{
		Node next;
		Node prev;
		int data;
		
		public Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	public DoublyCircular() {
		head = null;
	}

	public void addNode(int val) {
		// TODO Auto-generated method stub
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
			newnode.next = newnode;
			newnode.prev = newnode;
		}
		else {
			Node temp = head;
			while(temp.next != head) {
				temp.next = newnode;
				newnode.prev = temp;
				newnode.next = temp.next;
				temp.next.prev = newnode;
			}
		}
		
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			Node temp = head;
			while(temp.next != head) {
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	

}
