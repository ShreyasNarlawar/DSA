package com.demo.test;

import com.demo.queue.MyCircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		MyCircularQueue qc=new MyCircularQueue(5);
		qc.enqueue(10);
		qc.enqueue(11);
		qc.enqueue(12);
		qc.enqueue(13);
		System.out.println("Data : "+qc.dequeue());
		qc.enqueue(15);
		qc.enqueue(20);
		System.out.println("Data : "+qc.dequeue());
		System.out.println("Data : "+qc.dequeue());
		qc.enqueue(22);
		qc.enqueue(25);
		System.out.println("Data : "+qc.dequeue());
		System.out.println("Data : "+qc.dequeue());
		System.out.println("Data : "+qc.dequeue());
		System.out.println("Data : "+qc.dequeue());
		qc.enqueue(100);
		qc.enqueue(200);  //20,22,25,100,200
	}

}
