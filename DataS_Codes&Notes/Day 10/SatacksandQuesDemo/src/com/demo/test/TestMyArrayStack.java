package com.demo.test;

import com.demo.stacks.MyArrayStack;
import com.demo.stacks.MyListStack;

public class TestMyArrayStack {

	public static void main(String[] args) {
		MyArrayStack st=new MyArrayStack(5);
		//MyListStack st=new MyListStack();
		st.push(12);
		st.push(15);
		st.push(13);
		st.push(10);
		st.push(20);
		st.push(40);
		while(!st.isEmpty()) {
			System.out.println("value : "+st.pop());
		}
		

	}

}
