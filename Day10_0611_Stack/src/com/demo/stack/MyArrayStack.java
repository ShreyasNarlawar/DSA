package com.demo.stack;

public class MyArrayStack {

	private int topp;
	private int []arr;
	
	public MyArrayStack() {
		topp=-1;
		arr=new int[8];
	}

	public MyArrayStack(int num) {
		// TODO Auto-generated constructor stub
		topp=-1;
		arr = new int[num];
	}
	public boolean isEmpty() {
		return topp==-1;
	}
	public boolean isFull() {
		return topp==arr.length-1;
	}
	public void pushStack(int val) {
		if(isFull()) {
			System.out.println("Stack is Full..");
		}else {
			topp++;
			arr[topp]=val;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty..");
		}else {
			int a=arr[topp];
			topp--;
			return a;
		}
		return -1;
	}
}
