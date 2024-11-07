package com.demo.stack;

public class MyStack {
	private char[] arr;
	private int topp;
	
	public MyStack() {
		topp=-1;
		arr=new char[10];
	}
	public MyStack(int a) {
		topp=-1;
		arr=new char[a];
	}
	public boolean isempty() {
		return topp==-1;
	}
	public boolean isfull() {
		return topp==arr.length-1;
	}
	public void push(char data) {
		if(isfull()) {
			System.out.println("Stack is Full..");
		}else
			topp++;
		arr[topp]=data;
	}
	public char pop() {
		if(isempty()) {
			System.out.println("Stack is Empty..");
		}else {
			char n=arr[topp];
			topp--;
			return n;
		}
		return '$';
	}
}
