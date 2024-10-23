package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class ImprovedTestBubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size for array to sort :");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter value for Index "+i+" :");
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sorted :");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		BubbleSort(arr);

	}

	private static void BubbleSort(int[] arr) {
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
			if(cnt == 0)
				break;
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
