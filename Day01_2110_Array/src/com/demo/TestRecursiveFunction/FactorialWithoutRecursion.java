package com.demo.TestRecursiveFunction;

import java.util.Scanner;

public class FactorialWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number for factorial");
	int num = sc.nextInt();
	int fact=1;
		for(int i = 1; i <=num; i++) { 
				fact=fact*i;
		}
		System.out.println("The Factorial is "+fact);
		
		System.out.println("Enter Number to find number of Factorial :");
		int fact1=sc.nextInt();
		int num1=0;
		int factvalue1 = 1;
		do {
			num1++;
			factvalue1 = factvalue1 * num1;
		}while( factvalue1 <= fact1 );
		System.out.println("Number is : "+(num1-1));
		


	}
}
