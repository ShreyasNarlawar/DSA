package com.demo.test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		
	Queue<Integer> q = new LinkedList<>();
	
		q.add(5);
		q.add(6);
		q.add(9);
		q.add(8);
		q.add(3);
		
		System.out.println(q);
		
		System.out.println("removed element from queue is "+q.remove());
		
		q.add(32);
		
		System.out.println("peeked element from queue is "+q.peek());
		
		System.out.println("Queue = "+q);
		
		System.out.println(q);
		
		System.out.println(q.poll());
		
		System.out.println(q);
	}
}
