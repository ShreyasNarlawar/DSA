package com.demo.test;
import java.util.*;
public class stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> St = new Stack<>();
		
		System.out.println("Enter size to add Numbers in Stack : ");
		int tnum = sc.nextInt();
		
		for(int i=1;i<=tnum;i++) {
			System.out.println("Enter Number "+i+": ");
			int n=sc.nextInt();
			St.push(n);
		}
		while(!St.isEmpty()) {
			System.out.println("Poping number :"+St.pop());
		}
	}
}
