package com.demo.test;

import com.demo.stack.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ms = new MyStack(40);
		String str = "Hello ,This is Shreyas..";
		
		for(int i=0;i<str.length();i++) {
			
			if(!ms.isfull()) {
				ms.push(str.charAt(i));
			}
		}
		while(!ms.isempty()) {
			System.out.println(ms.pop());
		}
	}

}
