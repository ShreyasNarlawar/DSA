package com.demo.hashing;

public class MyHashingLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		
		
	}
	public MyHashingLinkedList() {
		this.head = null;
	}
	
	public void addValue(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}else {
			newnode.next=head;
			head=newnode;
		}
	}
	
	public boolean search(int val) {
		
		if(head==null) {
			return false;
		}else {
			Node temp=head;
			while(temp!=null && temp.data!=val ) {
				temp=temp.next;
			}
			if(temp!=null && temp.data==val)
				return true;
			else
				return false;
			
		}
	}
	
	public boolean deletedata(int val) {
		if(head==null) {
			return false;
		}else {
			Node temp=head;
			if(head.data==val) {
				head=head.next;
				
			}else {
				Node prev=null;
				while(temp!=null && temp.data!=val ) {
					prev=temp;
					temp=temp.next;
				}
				if(temp.data==val) {
					prev.next=temp.next;
				}else {
					return false;
				}
		       }
			temp.next=null;
			temp=null;
			return true;
		  }
		
			
			
			
			
		}
	
	public void displayList() {
		if(head==null) {
			System.out.print("empty");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			System.out.print("null");
		}
	}
}
	
	


