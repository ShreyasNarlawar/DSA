package com.demo.hashing;

public class HashingLinkedlist {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public HashingLinkedlist() {
		head = null;
	}
	
	public void addNode(int val) {
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
			
		}
	}

	public void displayList() {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + "----->");
				temp = temp.next;
			}
			System.out.print("null");
			System.out.println();
		}
		
	}

	public boolean deleteNode(int val) {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			Node temp = head;
			if(head.data == val) {
				head = temp.next;
				temp.next = null;
				temp = null;
			}else {
				Node prev = null;
				while(temp != null && temp.data != val) {
					prev = temp;
					temp = temp.next;
				}
				if(temp != null) {
					prev.next = temp.next;
					temp.next = null;
					temp = null;
					return true;
				}
				else {
					System.out.println("out of bound");
					return false;
				}
			}
		}
		return false;
	}

	public boolean search(int val) {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			Node temp = head;
			while(temp != null && temp.data != val) {
				temp = temp.next;
			}
			if(temp.data == val) {
				return true;
			}else {
				return false;
			}
			
		}
		return false;
	}


}
