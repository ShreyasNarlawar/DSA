package com.demo.test;

import java.util.Arrays;

import java.util.Scanner;

public class Countsort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = 0;
		System.out.println("Enter size of array");
		int arr[] = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter number at "+ " ");
			arr[i] = sc.nextInt();
		}
		int []sortdata = Countsort(arr);
		System.out.println("After sorting ");
		System.out.println(Arrays.toString(sortdata));

	}

	private static int[] Countsort(int[] arr) {
		int max = findmax(arr);
		
		int counter[] = new int[max+1];
		
		for(int i = 0; i < arr.length; i++) {
			counter[arr[i]] ++;
		}
		
		System.out.println("Counter array");
		System.out.println(Arrays.toString(counter));
		
		for(int i = 1; i < counter.length; i++) {
			counter[i] = counter[i] + counter[i-1];
		}
		System.out.println("Cumulative sum array is");
		System.out.println(Arrays.toString(counter));
		
		
		int []output = new int[arr.length];
		for(int i = 9; i < counter.length; i++) {
			output[counter[arr[i]]-1] = arr[i];
			counter[arr[i]]--;
		}
		return output;
	}
	
	

	private static int findmax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
				if(max  < arr[i]) {
					max = arr[i];
				}
		}
		return max;
		
	}

}
