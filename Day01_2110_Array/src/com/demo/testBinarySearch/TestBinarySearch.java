package com.demo.testBinarySearch;

import java.util.Scanner;

import com.demo.BinarySearchServ.BinarySearchServ;

public class TestBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		System.out.println("Enter numbers in sorted order ");
		for(int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter number to search");
		int num = sc.nextInt();
		int pos = BinarySearchServ.searchElement(arr,0, arr.length-1,num);
		if(pos == -1)
			System.out.println("Not Found");
		else
			System.out.println("Element found on position "+pos);
	}

}
