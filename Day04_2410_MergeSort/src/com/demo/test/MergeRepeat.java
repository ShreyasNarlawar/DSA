package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class MergeRepeat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the number");
			arr[i] = sc.nextInt();
		}
		
		Mergesort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void Mergesort(int[] arr, int start, int end) {
		
		if(start < end) {
			int mid = (start + end)/2;
			Mergesort(arr,start,mid);
			Mergesort(arr,mid+1,end);
			
			Mergearr(arr,start,mid,end);
		}		
	}

	private static void Mergearr(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		int n1 = mid - start+1;
		int n2 = end - mid;
		
		int []larr = new int[n1];
		int []rarr = new int[n2];
		
		a = 0;
		for(int i = start; i <= mid; i++) {
			 larr[a] = arr[i];
			 a++;
		}
		b =0;
		for(int j = mid+1; j <= end; j++) {
			rarr[b] = arr[j];
			b++;
		}
		a=0;
		b=0;
		c=start;
		
		while(n1 > a && n2 > b) {
			if(larr[a] < rarr[b]) {
				arr[c] = larr[a];
				c++;
				a++;
			}
			else {
				arr[c] = rarr[b];
				c++;
				b++;
			}
		}
		
		while(n1 > a) {
			arr[c] = larr[a];
			c++;
			a++;
		}
		while(n2 > b) {
			arr[c] = rarr[b];
			c++;
			b++;
		}
	}

}
