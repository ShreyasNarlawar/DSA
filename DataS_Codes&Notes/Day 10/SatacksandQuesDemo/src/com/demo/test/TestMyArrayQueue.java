package com.demo.test;

import com.demo.queue.MyArrayQueue;

public class TestMyArrayQueue {

	public static void main(String[] args) {
		MyArrayQueue qarr=new MyArrayQueue(5);
		qarr.enqueue(10);
		qarr.enqueue(11);
		qarr.enqueue(12);
		qarr.enqueue(13);
		qarr.enqueue(14);
		qarr.enqueue(15);
		while(!qarr.isEmpty()) {
			System.out.println("Data : "+qarr.dequeue());
		}
		qarr.enqueue(15);
	}

}
