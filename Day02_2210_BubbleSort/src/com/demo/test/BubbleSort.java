package com.demo.test;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {65,32,56,89,42,12,6};
		System.out.println("Before Sorted :");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		BubbleSortMethod(arr);
	}

	private static void BubbleSortMethod(int[] arr) {
		int cnt =0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length - i; j++) {	
				if(arr[j] < arr[j-1]) {
					
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
					cnt++;
				}
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("Total Iteration : "+cnt);
			cnt=0;
		}
			System.out.println("\n After Sorted :");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
		}	
	}
}
