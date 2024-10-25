package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter values for "+i+" index : ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Merge(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void Merge(int[] arr, int start, int end) {
		if( start < end) {
			int mid = (start + end)/2;
			Merge(arr,start,mid);
			Merge(arr,mid+1,end);
			MergeArr(arr,start,mid,end);
		}
		
	}

	private static void MergeArr(int[] arr, int start, int mid, int end) {
		int l,m,n;
		int n1 = mid-start+1;
		int n2 = end-mid;
		
		int []Larr = new int[n1];
		int []Rarr = new int[n2];
		
		l=0;
		for(int i = start; i <= mid;i++) {
			Larr[l] = arr[i];
			l++;
		}
		m=0;
		for(int i = mid+1; i <= end;i++) {
			Rarr[m] = arr[i];
			m++;
		}
		l=0; 
		m=0;
		n= start;
		
		while(l< n1 && m < n2) {
			if(Larr[l] < Rarr[m]) {
				arr[n] = Larr[l];
				l++;
				n++;
			}
			else{
				arr[n] = Rarr[m];
				m++;
				n++;
			}
		}
		while(n1 > l) {
			arr[n] = Larr[l];
			l++;
			n++;
		}
		while(n2 > m) {
			arr[n] = Rarr[m];
			m++;
			n++;
		}
		
	}

}
