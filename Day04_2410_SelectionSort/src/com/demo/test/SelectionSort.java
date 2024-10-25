package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i < arr.length;i++) {
		System.out.println("Enter the element of array");
			arr[i] = sc.nextInt();
		}
		
		selectionsort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionsort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int max = i;
			
			for(int j =i+1; j < arr.length; j++) {
				if(arr[j] < arr[max]) {
					max=j;
				}
		     }
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		
		}
	}

}
