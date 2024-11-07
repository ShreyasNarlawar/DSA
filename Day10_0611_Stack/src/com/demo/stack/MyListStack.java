package com.demo.stack;

public class MyListStack {

	private Node top;
	
	class Node {
		
		int data;
		Node next;
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	public MyListStack() {
		top=null;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public void push(int data) {
		Node newnode = new Node(data);
		if(top==null)
			top = newnode;
		else {
			newnode.next=top;
			top=newnode;
		}
	}
	public int pop() {
		if(isEmpty())
			System.out.println("Stack is EMpty..");
		else {
			Node temp=top;
			top=temp.next;
			temp.next=null;
			return temp.data;
		}
		return -1;
	}
}
