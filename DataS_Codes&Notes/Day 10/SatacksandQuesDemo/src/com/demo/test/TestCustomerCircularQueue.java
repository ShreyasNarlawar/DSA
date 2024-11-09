package com.demo.test;

import com.demo.beans.Customer;
import com.demo.queue.MyCircularQueueCustomer;

public class TestCustomerCircularQueue {

	public static void main(String[] args) {
		MyCircularQueueCustomer qcustomer=new MyCircularQueueCustomer(5);
		qcustomer.enqueue(new Customer(1,"Ashu","aaaa"));
		qcustomer.enqueue(new Customer(2,"Deepa","bbbb"));
		qcustomer.enqueue(new Customer(3,"Sangeeta","ccc"));
		qcustomer.enqueue(new Customer(4,"Kedar","ddddd"));
		qcustomer.enqueue(new Customer(5,"Prasanna","zzzz"));
		System.out.println("Dequeue: "+qcustomer.dequeue());
		qcustomer.enqueue(new Customer(6,"Mandar","rrrr"));
		qcustomer.enqueue(new Customer(7,"ddddd","eeeee"));
	}

}
