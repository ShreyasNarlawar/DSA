package com.demo.queue;

public class MyArrayQueue {
	int[] arr;
	int front;
	int rear;
	public MyArrayQueue() {
		front=0;
		rear=0;
		arr=new int[10];
	}
	public MyArrayQueue(int size) {
		front=0;
		rear=0;
		arr=new int[size];
	}
	
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			arr[rear]=val;
			rear++;
		}
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			int n=arr[front];
			front++;
			return n;
		}
		return -1;
	}
	public boolean isEmpty() {
		return front==rear;
	}
	public boolean isFull() {
		return rear==arr.length;
	}
	

}
