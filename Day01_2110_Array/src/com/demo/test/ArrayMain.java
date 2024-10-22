package com.demo.test;

import java.util.Scanner;

import com.demo.service.ArrayServ;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int [] arr = {30,12,13,11,2,4,12};
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		
		System.out.println("Enter numbers to find addition of prime numbers");
		System.out.println("Don't Enter 0 and 1 if enter then we skip it..");
		for(int i = 0; i < size; i++) {
			do {
				arr[i]=sc.nextInt();
			}while(arr[i]==0 || arr[i]==1);
		}
		int max = ArrayServ.findMax(arr);
		System.out.println("Maximum number is "+max);
		
		int max2 = ArrayServ.findSecondMax(arr);
		System.out.println("Second max is "+ max2);
		
		int sum = ArrayServ.findSumOfPrime(arr);
		if(sum > 0)
			System.out.println("Sum of prime numbers is "+sum);
		else
			System.out.println("No prime numbers found");
		
		System.out.println("Enter value to search in an array");
		int val = sc.nextInt();
		int pos = ArrayServ.linearSearch(arr,val);
		if(pos == -1)
			System.out.println("Not found in an array");
		else
			System.out.println("Number found on index " + pos);
		
	}

}
