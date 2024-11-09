package com.demo.queue;

public class MyArrayQueue {
	int[] arr;
	int front;
	int rear;
	public MyArrayQueue() {
		arr = new int[10];
		front=0;
		rear=0;
	}
	public MyArrayQueue(int size) {
		arr=new int[size];
		front=0;
		rear=0;
	}

	public boolean isFull() {
		return rear == arr.length;
	}
	public boolean isEmpty() {
		return front == rear;
	}
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue is Full..");
		}else {
			arr[rear]=val;
			rear++;
		}
	}
	public int dequeue() {
		if(isEmpty())
			System.out.println("Queue is Empty..");
		else {
			int a = arr[front];
			front++;
			return a;
		}
		return -1;
	}
}
