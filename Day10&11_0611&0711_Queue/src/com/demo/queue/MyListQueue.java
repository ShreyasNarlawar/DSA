package com.demo.queue;

public class MyListQueue {
	private Node front , rear;
	class Node{
		int data;
		Node next;
		public Node(int a){
			super();
			data = a;
			next=null;
		}
		
	}
	public MyListQueue() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return front == null && rear == null;
	}
	
	public void enqueue(int val) {
		Node newnode = new Node(val);
		if(!isEmpty()) {
			rear.next = newnode;
			rear = newnode;
			
		}else {
			front = newnode;
			rear = newnode;
		}
	}
	
	public int dequeue() {
		if(isEmpty())
			System.out.println("list is empty");
		else {
			Node temp = front;
			front = temp.next;
			if(front == null)
				rear = null;
			temp.next = null;
			return temp.data;
		}
		return -1;
			
	}
}
