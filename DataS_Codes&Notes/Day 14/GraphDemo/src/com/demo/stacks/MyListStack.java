package com.demo.stacks;

public class MyListStack {
	private Node top;
	class Node{
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
	public void push(int n) {
		Node newnode=new Node(n);
		if(top==null) {
			top=newnode;
		}else {
			newnode.next=top;
			top=newnode;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
			Node temp=top;
			top=temp.next;
			temp.next=null;
			return temp.data;
		}
		return -1;
	}

}
