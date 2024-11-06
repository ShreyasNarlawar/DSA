package com.demo.linkedlist;

public class CircularLinkedList {
	Node head,tail;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
		}
		
		
	}
	public CircularLinkedList() {
		head=null;
		tail=null;
	}
	
	//add at the end of the list
	public void addNode(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
			tail=newnode;
			
		}else {
			tail.next=newnode;
			tail=newnode;
			
		}
		tail.next=head;
	}
	
	public void addByPosition(int val, int pos) {
		if(head==null) {
			System.out.println("the list is empty");
		}else {
			Node newnode=new Node(val);
			if(pos==1) {
				newnode.next=head;
				head=newnode;
				tail.next=newnode;
			}else {
			
			Node temp=head;
			int i=1;
			for(;temp.next!=head && i<=pos-2;i++) {
				temp=temp.next;
			}
			//whether we reached to required position
			if(i>pos-2) {
				if(temp.next==head) {
				//add at the end
					tail=newnode;
				}
				newnode.next=temp.next;
				temp.next=newnode;
			}else {
				System.out.println("position is beyond the limit");
			}
		}
		}
	}
	
	public void displaydata() {
		if(head==null)
			System.out.println("list is empty");
		else {
			Node temp=head;
			while(temp.next!=head) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
			System.out.println("--------------");
		}
		
	}
	

}
