package com.demo.TestRecursiveFunction;

import java.util.Scanner;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number ");
		int n = sc.nextInt();
		int ans =factorial(n);
		int ans2 = summ(n);
		
		System.out.println("Factorial of number is "+ ans);
		
		System.out.println("sum  of number is "+ ans2);

		
	}
		
		private static int factorial(int num) {
			int fact = 0;
			if(num == 1)
				return  1;
			else
				return num = num * factorial(num-1);
			   
		}
		
		private static int summ(int num) {
			int sum = 0;
			if(num ==1)
				return 1;
			else
				return num = num + summ(num-1);
		}

}
