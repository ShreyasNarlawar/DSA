package com.demo.lists;


public class MyLinkedList {
	Node head;
	class Node{
		int data;
		//int weight;
		Node next;
		
		public Node(int data){//,int w) {
			super();
			this.data = data;
			//this.weight=w;
			this.next = null;
		}
		
		
		
	}
	public MyLinkedList() {
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
	
	public int[] getAdjescentNodes(int[] arr) {
		Node temp=head;
		for(int i=0;temp!=null && i<arr.length;i++) {
			arr[i]=temp.data;
			temp=temp.next;
		}
		return arr;
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
			System.out.println();
		}
	}
}
	
	


