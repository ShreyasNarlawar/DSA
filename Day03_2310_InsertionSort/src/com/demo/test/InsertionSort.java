package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		System.out.println("ENter a size :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter value for Index "+i+" :");
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sorted :");
		System.out.println(Arrays.toString(arr));
		Insertsort(arr);
		System.out.println("After Sorted :");
		System.out.println(Arrays.toString(arr));
		
		sc.close();
		
	}
	private static void Insertsort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			
			int j = i -1;
			int num = arr[i];
			
			while(j >= 0 && arr[j] > num) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=num;
			
			System.out.println("Iterations :"+i);
			System.out.println(Arrays.toString(arr));
		}
	}
}