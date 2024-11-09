package com.demo.stacks;

public class MyStack {
	private char[] arr;
	private int top;
	public MyStack() {
		top=-1;
		arr=new char[10];
	}
	public MyStack(int size) {
		top=-1;
		arr=new char[size];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	public void push(char val) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			top++;
		    arr[top]=val;
		}
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
		   char n=arr[top];
		   top--;
		   return n;
		}
		return '$';
	}
}
