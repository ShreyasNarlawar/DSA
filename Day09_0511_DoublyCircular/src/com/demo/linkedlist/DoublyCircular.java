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
			Node tail = head.prev;
			tail.next = newnode;
			newnode.prev=tail;
			newnode.next = head;
			head.prev = newnode;
			System.out.println("Added SuccessFully..");
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
		System.out.println("=====================================================");
	}
	public void deleteByPosition(int pos) {
		if(head == null) {
			System.out.println("List is Empty");
		}
		else {
			Node temp=head;
			if(pos==1) {
				head.prev.next = temp.next;
				temp.next.prev = temp.prev;
				head=temp.next;
			}else {
				int i=1;
				for(;temp.next != head && i<=pos-1;i++)
					temp = temp.next;
				if(i>pos-1) {
					temp.next.prev = temp.prev;
					temp.prev.next=temp.next;
					temp.next = null;
					temp.prev = null;
					temp=null;
					System.out.println("Deleted Successfully..");
				}else
					System.out.println("Position Beyond Limit..");
			}
				
		}
	}
	

}
