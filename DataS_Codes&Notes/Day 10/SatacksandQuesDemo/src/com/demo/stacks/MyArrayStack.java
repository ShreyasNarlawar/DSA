package com.demo.stacks;

import java.util.Arrays;

public class MyArrayStack {
	private int[] arr;
	private int top;
	public MyArrayStack() {
		top=-1;
		arr=new int[10];
	}
	public MyArrayStack(int size) {
		top=-1;
		arr=new int[size];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	public void push(int val) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			top++;
		    arr[top]=val;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
		   int n=arr[top];
		   top--;
		   return n;
		}
		return -1;
	}

}
