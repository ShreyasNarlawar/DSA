package com.demo.linkedlist;

import com.demo.beans.Employee;

public class SinglyEmpList {

	class Node {
		Employee data;
		Node next;
		public Node( Employee data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	public SinglyEmpList() {
		head = null;
		
	}
	public void addNode(Employee e) {
		Node newnode = new Node(e);
		if(head == null) {
			head = newnode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	public void displayData() {
	   Node temp = head;
	   if(head != null) {
		   while(temp != null) {
			   System.out.println(temp.data);
			   temp = temp.next;
		   }
	   }
		System.out.println("----------------------------------------------------------------------");
	}
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Node temp = head;
		if(head.data.getEmpid() == id) {
			head = temp.next;
			temp.next = null;
			temp = null;
		}else {
			Node prev = null;
			while(temp != null && temp.data.getEmpid() != id) {
				prev = temp;
				temp = temp.next;
			}
			if(temp.data.getEmpid() == id && temp != null) {
				prev.next = temp.next;
				temp.next = null;
				temp = null;
			}else 
				System.out.println("Id not found "+ id);
		}
	}
	public void searchById(int id) {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp != null && temp.data.getEmpid() != id) 
			temp = head.next;
		if(temp.data.getEmpid() == id && temp != null)
			System.out.println(temp.data);
		else 
			System.out.println("Id not found");
		
	}

}
