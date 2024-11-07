package com.demo.linkedlist;

public class DublycircularLinkedList {
	Node head;
	class Node{
		int data;
		Node prev,next;
		public Node(int val) {
			data=val;
			prev=null;
			next=null;
		}
	}
	public DublycircularLinkedList() {
		head=null;
	}
	
	public void addNode(int val) {
		Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }

	}
	public void deleteByPosition(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			if(pos==1) {
				head.prev.next=temp.next;
				temp.next.prev=temp.prev;
				head=temp.next;
			}else {
				int i=1;
				for(;temp.next!=head && i<=pos-1;i++) {
					temp=temp.next;
				}
				if(i>pos-1) {
					temp.next.prev=temp.prev;
					temp.prev.next=temp.next;
					temp.next=null;
					temp.prev=null;
					temp=null;
				}else {
					System.out.println("position is beyond the limit");
				}
				
			}
		}
	}
	
	public void displayData() {
		if(head==null) {
			System.out.println("empty list");
		}else {
			Node temp=head;
			while(temp.next!=head) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
			System.out.println("-------------------");
		}
		
	}

}
