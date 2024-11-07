package com.demo.test;

import com.demo.stack.MyArrayStack;

public class TestMyArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayStack mas = new MyArrayStack(5);
		mas.pushStack(41);
		mas.pushStack(11);
		mas.pushStack(24);
		mas.pushStack(47);
		mas.pushStack(32);
		mas.pushStack(95);
		
		while(!mas.isEmpty())
			System.out.println(mas.pop());
	}
}
