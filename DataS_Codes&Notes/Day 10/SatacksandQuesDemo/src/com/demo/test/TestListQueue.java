package com.demo.test;

import com.demo.queue.MyListQueue;

public class TestListQueue {

	public static void main(String[] args) {
		MyListQueue qlist=new MyListQueue();
		qlist.enqueue(23);
		qlist.enqueue(12);
		qlist.enqueue(55);
		qlist.enqueue(231);
		qlist.enqueue(53);
		qlist.enqueue(20);
		while(!qlist.isEmpty()) {
			System.out.println("Data : "+qlist.dequeue());
		}

	}

}
