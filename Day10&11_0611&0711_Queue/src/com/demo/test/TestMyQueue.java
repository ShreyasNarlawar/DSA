package com.demo.test;

import com.demo.queue.MyQueue;

public class TestMyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueue mq = new MyQueue();
		
		mq.enqueue(5);
		mq.enqueue(3);
		mq.enqueue(2);
		mq.enqueue(7);
		
		System.out.println(mq);
	}

}
