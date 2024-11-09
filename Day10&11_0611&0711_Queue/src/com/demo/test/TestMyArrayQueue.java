package com.demo.test;

import com.demo.queue.MyArrayQueue;

public class TestMyArrayQueue {
	public static void main(String[] args) {
		MyArrayQueue maq = new MyArrayQueue(8);
		maq.enqueue(20);
		maq.enqueue(74);
		maq.enqueue(98);
		maq.enqueue(36);
		maq.enqueue(42);
		maq.enqueue(12);
		System.out.println(maq.dequeue());
	}
}
