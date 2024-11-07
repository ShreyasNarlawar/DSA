package com.demo.test;

import com.demo.stacks.MyStack;

public class TestCharStack {

	public static void main(String[] args) {
		MyStack st=new MyStack(20);
		String s="This is string";
		for(int i=0;i<s.length();i++) {
			if(!st.isFull())
				st.push(s.charAt(i));
		}
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		

	}

}
