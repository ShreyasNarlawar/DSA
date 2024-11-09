package com.demo.queue;

import java.util.Arrays;

public class MyCircularQueue {
	int[] arr;
	int front;
	int rear;
	public MyCircularQueue() {
		front=-1;
		rear=-1;
		arr=new int[10];
	}
	public MyCircularQueue(int size) {
		front=-1;
		rear=-1;
		arr=new int[size];
	}
	public boolean isFull() {
		if(front==0 && rear==arr.length-1)
			return true;
		if(front==rear+1)
			return true;
		return false;
	}
	public boolean isEmpty() {
		return front==-1;
	}
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		//it will place front to 0, when only one element in the queue at oth position
		if(front==-1)
			front=0;
		rear=(rear+1) % arr.length;
				arr[rear]=val;
		System.out.println(Arrays.toString(arr));
		
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			int n=arr[front];
			//this checks whether all the values have been read, so queue should be restarted from 0
			if(front==rear){
				front=-1;
				rear=-1;
			}else {
				front=(front+1)%arr.length;
				
			}
			System.out.println(Arrays.toString(arr));
			return n;
			 
		}
		System.out.println(Arrays.toString(arr));
		return -1;
	}
	
	

}
