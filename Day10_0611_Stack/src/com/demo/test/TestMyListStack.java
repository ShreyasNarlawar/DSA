package com.demo.test;

import com.demo.stack.MyListStack;

public class TestMyListStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyListStack mls = new MyListStack();
		mls.push(56);
		mls.push(80);
		mls.push(10);
		mls.push(61);
		mls.push(87);
		mls.push(59);
		mls.push(12);
		mls.push(93);
		
		while(!mls.isEmpty()) {
			System.out.println(mls.pop());
		}
	}	

}
