package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size for array :");
		int size = sc.nextInt();
		int[]arr = new int[size];
			
			for(int i=0;i<size;i++) {
				System.out.println("ENter value for index :"+i+" : ");
				arr[i] =sc.nextInt();
			}
		System.out.println("Before Sort");
		System.out.println(Arrays.toString(arr));
		Heapsort(arr);
		System.out.println("After Sort");
		System.out.println(Arrays.toString(arr));
	}

	private static void Heapsort(int[] arr) {
		int n=arr.length;
		for(int i=(n/2)-1;i>=0;i--)
			heapify(arr,n,i);
			System.out.println(Arrays.toString(arr));			
		
		for(int i=n-1;i>0;i--) {
			int binkami = arr[0];
			arr[0]=arr[i];
			arr[i]=binkami;
			heapify(arr,i,0);
			System.out.println("Sorted "+i);
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void heapify(int[] arr, int n, int i) {
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n&&arr[left]>arr[largest])
			largest = left;
		
		if(right<n&&arr[right]>arr[largest])
			largest=right;
		
		if(largest!=i) {
			int binkami = arr[i];
			arr[i]=arr[largest];
			arr[largest]=binkami;
			heapify(arr,n,largest);
		}
	}
}
