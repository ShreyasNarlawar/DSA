package com.demo.test;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {65,32,56,89,42,12,6};
			System.out.println("Before Sorted :");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			QuickSortMethod(arr,0, arr.length-1);
			System.out.println(Arrays.toString(arr));
		}

	private static void QuickSortMethod(int[] arr, int first, int last) {
		if(first < last) {
				int i = first;
				int j = last;
				int pivot = first;
				
				while( i < j) {
					
					while(arr[i] <= arr[pivot] && i < last) {
						i++;
					}
					while(arr[j] > arr[pivot] && j > pivot) {
						j--;
					}
					if(i < j) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				
				int temp = arr[pivot];
				arr[pivot] = arr[j];
				arr[j] = temp;
				
				QuickSortMethod(arr,first,j-1);
				QuickSortMethod(arr,j+1,last);
				
		}
//		System.out.println(Arrays.toString(arr));
	}
	

}
