package com.demo.test;

import com.demo.queue.MyListQueue;

public class TestMyListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyListQueue mlq = new MyListQueue();
		
		mlq.enqueue(12);
		mlq.enqueue(23);
		mlq.enqueue(7);
		mlq.enqueue(56);
		

		while(! mlq.isEmpty()) {
			System.out.println("data is "+mlq.dequeue());
		}
	}

}
