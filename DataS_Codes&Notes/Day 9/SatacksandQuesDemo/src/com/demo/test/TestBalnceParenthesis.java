package com.demo.test;

import com.demo.stacks.MyStack;

public class TestBalnceParenthesis {

	public static void main(String[] args) {
		//String str="{{{[](){}}}}";
		String str="{{{[](){}}}]}";
		MyStack st=new MyStack(20);
		boolean flag=isBalanced(st,str);
		if(flag) {
			System.out.println("The string has balanced parenthesis");
		}else {
			System.out.println("The string has not balanced parenthesis");
		}
		

	}

	private static boolean isBalanced(MyStack st, String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{') {
				st.push(ch);
			}else {
				if(!st.isEmpty()) {
					char ch1=st.pop();
					// if we could not find matching opening bracket in stack
					if((ch=='}' && ch1!='{') || (ch==')' && ch1!='(') || (ch==']' && ch1!='[')){
						return false;
					}
					
				}else { // string is not yet finished but stack is empty
					return false;
				}
			}
			
			
		}
		if(st.isEmpty()) {
			return true;
		}else { //stack is not empty, but string is finished
			return false;
		}
	}

}
