package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array 1");
		int size1 = sc.nextInt();
		
		int arr1[] = new int[size1];
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("Enter number for "+i+ ":");
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of array 2");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("Enter number  for "+i+ ":");
			arr2[i] = sc.nextInt();
		}
		int arr3[] = new int[arr1.length+arr2.length];
		
		MergeArrays(arr1, arr2, arr3);
		
		System.out.println("The first array is "+Arrays.toString(arr1));
		
		System.out.println("The Second array is "+Arrays.toString(arr2));
		
		System.out.println("Merged array is "+Arrays.toString(arr3));
	}

	private static void MergeArrays(int[] A, int[] B, int[] C) {
		int i =0,j=0,k=0;
		
		while(i < A.length && j < B.length) {
			if(A[i] < B[j]) {
				C[k]= A[i];
				i++;
				k++;
			}
			else {
				C[k] = B[j];
				j++;
				k++;
			}
		}
		while(i < A.length) {
			C[k]= A[i];
			i++;
			k++;
		}
		while(j < B.length) {
			C[k] = B[j];
			j++;
			k++;
		}	
	}
}
