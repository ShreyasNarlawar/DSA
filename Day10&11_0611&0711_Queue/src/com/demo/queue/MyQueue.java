package com.demo.queue;


public class MyQueue {
private Node front;
private Node rear;
	
	class Node {
		int data;
		Node next;
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	public MyQueue() {
		front =null;
		
		rear = null;
	}
	public boolean isEmpty() {
		return front == null && rear == null;
	}
	
	//add at end 
	public void enqueue(int x) {
		Node newnode = new Node(x);
		
		if(front == null) {
			front = newnode;
			rear = newnode;
		}
		else {
			rear.next = newnode;
			rear = newnode;
		}
	}
	
	//delete at front
	public int dequeue() {
		
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			Node temp = front;
			
			front  = temp.next;
			if(front == null)
				rear = null;
			
			return temp.data;
		}
		return -1;
	}
}
