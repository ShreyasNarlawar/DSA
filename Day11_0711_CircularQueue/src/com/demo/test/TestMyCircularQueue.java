package com.demo.test;

import com.demo.queue.MyCircularQueue;

public class TestMyCircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCircularQueue mcq = new MyCircularQueue(5);
		
		mcq.enqueue(23);
		mcq.enqueue(676);
		mcq.enqueue(12);
		mcq.enqueue(89);
		mcq.enqueue(23);
		

	  System.out.println("data is "+mcq.dequeue());
	  System.out.println("data is "+mcq.dequeue());
	  System.out.println("data is "+mcq.dequeue());
	  System.out.println("data is "+mcq.dequeue());
	}

}
