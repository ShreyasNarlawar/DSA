package com.demo.lists;

import com.demo.lists.MyLinkedList.Node;

public class MyLinkedList {
	class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val=val;
			next = null;
		}
	}
	Node head;

	public MyLinkedList() {
		this.head = null;
	}

	public void addNode(int num) {
		Node nn = new Node(num);
		if(head==null)
			head=nn;
		else {
			nn.next=head;
			head=nn;
		}
	}
	
	public void displayList() {
		if(head==null)
			System.out.println("List is Empty..");
		else {
			Node temp= head;
			while(temp != null) {
				System.out.print(temp.val+"===>");
				temp=temp.next;
			}
			System.out.print("NULL");
			System.out.println();
		}
	}

	public int[] getAdjancentNodes(int[] arr) {
		// TODO Auto-generated method stub
		Node temp = head;
		for(int i = 0; temp != null && i < arr.length; i++) {
			arr[i] = temp.val;
			temp = temp.next;
		}
		return arr;
	}
}