package com.demo.test;

import java.util.Arrays;

public class TestSelectionSort {
	public static void main(String[] args) {
		int[] arr= {23,4,1,5,20,36,78,3,7};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arr));
		selectionsort(arr);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
		
	}

	private static void selectionsort(int[] arr) {
	    //i gives the begining of unsorted part
		for(int i=0;i<arr.length-1;i++)
		{
			int min_idx=i;
			//find the index position of minimum number in unsorted part of array
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
				
			}
			//swap 2 elements
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
			System.out.println("Minimum number "+arr[i]+"==="+arr[min_idx]);
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
