package com.demo.queue;

public class MyListQueue {
	private Node front,rear;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			next=null;
		}
		
		
	}
	public MyListQueue() {
		front=null;
		rear=null;
	}
	public boolean isEmpty() {
		return front==null && rear==null;
	}
	
	public void enqueue(int x) {
		Node newnode=new Node(x);
		if(isEmpty()) {
			front=newnode;
			rear=newnode;
		}else {
			rear.next=newnode;
			rear=newnode;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			System.out.println("in dequeue: "+front.data);
			Node temp=front;
			front=temp.next;
			if(front==null)
				rear=null;
			temp.next=null;
			return temp.data;
		}
		return -1;
	}
	

}
