package com.demo.linkedlist;

import com.demo.beans.Employee;

public class SinglyEmployeeList {
	Node head;
	class Node{
		Employee data;
		Node next;
		public Node(Employee data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		
		
	}
	
	public SinglyEmployeeList() {
		super();
		this.head = null;
	}

	public void addNode(Employee ob) {
		Node newnode=new Node(ob);
		//if the list is empty
		if(head==null) {
			head=newnode;
		}
		//else add at the end
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
		
	}
	
	public void deleteById(int id) {
		//delete from the begining
		Node temp=head;
		if(head.data.getEmpid()==id) {
			head=temp.next;
			temp.next=null;
			temp=null;
		}else {
			Node prev=null;
			while(temp!=null && temp.data.getEmpid()!=id) {
				prev=temp;
				temp=temp.next;
			}
			if(temp!=null && temp.data.getEmpid()==id) {
			      prev.next=temp.next;
			      temp.next=null;
			      temp=null;
			}else {
				System.out.println(" Id Not Found!! "+id);
			}
		}
		
		
	}
	
	public void searchById(int id) {
		Node temp=head;
		while(temp!=null && temp.data.getEmpid()!=id) {
			temp=temp.next;
		}
		if(temp!=null && temp.data.getEmpid()==id) {
			System.out.println(temp.data);
		}else {
			System.out.println(" Id Not Found!! "+id);
		}
		
	}
	public void displayData() {
		Node temp=head;
		if(head!=null) {
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	

}
