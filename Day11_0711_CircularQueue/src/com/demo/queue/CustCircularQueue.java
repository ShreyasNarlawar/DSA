package com.demo.queue;

import java.util.Arrays;

import com.demo.beans.Customer;

public class CustCircularQueue {
		
		Customer Carr[];
		int front;
		int rear;
		
		public CustCircularQueue() {
			super();
			front = -1;
			rear = -1;
		}
		
		public CustCircularQueue(int size) {
			super();
			front=-1;
			rear=-1;
			Carr=new Customer[size];
		}
		public boolean isFull() {
			if(front == 0 && rear == Carr.length -1)
				 return true;
			if(front == rear +1)
				return true;
			else 
				return false;
		}
		public boolean isEmpty() {
			return front == -1;
		}
		public void enqueue(Customer val) {
			if(isFull()) {
				System.out.println("List is full");
			}
			if(front == -1) {
				front = 0;
			}
			rear = (rear+1) % Carr.length;
			Carr[rear] = val;
			System.out.println(Arrays.toString(Carr));
		}
		
		public Customer dequeue() {
			if(isEmpty()) {
				System.out.println("list is empty");
			}
			else {
				Customer n = Carr[front];
				if(front == rear) {
					front = -1;
					rear = -1;
				}else {
					front = (front +1) % Carr.length;
				}
				System.out.println(Arrays.toString(Carr));
				return n;
			}
			System.out.println(Arrays.toString(Carr));
			return null;
		}
}
