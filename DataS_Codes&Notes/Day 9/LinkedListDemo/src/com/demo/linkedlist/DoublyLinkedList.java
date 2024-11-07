package com.demo.linkedlist;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node prev,next;
		public Node(int data) {
			super();
			this.data = data;
			prev=null;
			next=null;
		}
		
	}
	public DoublyLinkedList() {
		head=null;
	}
	
	//add at the ned
	public void addNode(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			temp.next=newnode;
			newnode.prev=temp;
			
		}
		
	}
	public void addBeforeKey(int val,int key) {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			//adding before head
			Node newnode=new Node(val);
			if(head.data==key) {
				newnode.next=head;
				head.prev=newnode;
				head=newnode;
			}else {
				Node temp=head;
				while(temp!=null && temp.data!=key) {
					temp=temp.next;
				}
				if(temp!=null) {
					newnode.next=temp;
					newnode.prev=temp.prev;
					temp.prev.next=newnode;
					temp.prev=newnode;
					
					
					
				}else {
					System.out.println("key not found");
				}
			}
		}
		
	}
	public void addAfterKey(int val,int key) {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			 Node newnode=new Node(val);
			 Node temp=head;
			 while(temp!=null && temp.data!=key) {
				 temp=temp.next;
			 }
			 if(temp!=null) {
				 newnode.next=temp.next;
				 newnode.prev=temp;
				 if(temp.next!=null) {
					 temp.next.prev=newnode;
				 }
				 temp.next=newnode;
			 }
		}
		
	}
	public void deleteByPosition(int pos) {
		Node temp=head;
		if(pos==1) {
			if(head!=null) {
				head=head.next;
				if(temp.next!=null)
				    temp.next.prev=null;
				temp.next=null;
				temp=null;
			}else {
				System.out.println("position beyond the limit");
			}
		}else {
			for(int i=1;temp!=null && i<=pos-1;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				temp.prev.next=temp.next;
				if(temp.next!=null) {
					temp.next.prev=temp.prev;
				}
				temp.next=null;
				temp.prev=null;
				temp=null;
			}
		}
	}
	
	public void addByPosition(int val,int pos) {
		Node newnode=new Node(val);
		//add node in th begining
		if(pos==1) {
			if(head==null)
				head=newnode;
			else {
				newnode.next=head;
				head.prev=newnode;
				head=newnode;
			}
		}else {
			Node temp=head;
			for(int i=0;temp!=null && i<pos-2;i++) {
				temp=temp.next;
			}
			if(temp==null) {
				System.out.println("Given position is beyond the limit");
			}else {
				newnode.next=temp.next;
				//adding in between
				if(temp.next!=null)
				  temp.next.prev=newnode;
				newnode.prev=temp;
				temp.next=newnode;
			}
			
		}
		
	}
	
	public void displayData() {
		Node temp=head;
		if(head!=null) {
			while(temp!=null) {
				System.out.print(temp.data+" , ");
				temp=temp.next;
				
			}
			System.out.println("-----------------------");
		}
	}
	
	public void displayDatainReverseOrder() {
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		while(temp!=null) {
			System.out.print(temp.data+" , ");
			temp=temp.prev;
		}
		System.out.println("-----------------------");
	}
	

}
