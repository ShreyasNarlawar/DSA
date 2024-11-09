package com.demo.test;

import com.demo.beans.Customer;
import com.demo.queue.CustCircularQueue;

public class TestCustCirclularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustCircularQueue ccq = new CustCircularQueue(5);
		ccq.enqueue(new Customer(14,"Harsh",53442.21));
		ccq.enqueue(new Customer(1,"Shruti",342542.21));
		ccq.enqueue(new Customer(54,"Shreya",57642.31));
		ccq.enqueue(new Customer(74,"Shreyas",63545687.2));
		ccq.enqueue(new Customer(4,"yash",87.2));
		
		System.out.println();
		System.out.println(ccq.dequeue());
		ccq.enqueue(new Customer(100,"Jethalaal",524765235.74));
	}

}
