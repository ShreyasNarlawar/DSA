package com.demo.test;

import java.util.Arrays;

public class TestMergeSort {

	public static void main(String[] args) {
		int[] arr= {23,1,2,56,34,2,7,8,9};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arr));
		mergesort(arr,0,arr.length-1);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
		
	}

	private static void mergesort(int[] arr, int start, int end) {
		if(start<end) {
			int mid=(start+end)/2;
			mergesort(arr,start,mid);
			mergesort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int i,j,k;
		//length of first array
		int n1=mid-start+1;   
		//length of second array
		int n2=end-mid;
		
		int[] leftarray=new int[n1];
		int[] rightarray=new int[n2];
		i=0;
		//copy of left portion of the array into left array
		for(int a=start;a<=mid;a++) {
			leftarray[i]=arr[a];
			i++;
		}
		//copy right portion of the array in to rightarray
		j=0;
		for(int a=mid+1;a<=end;a++) {
			rightarray[j]=arr[a];
			j++;
		}
		System.out.println("leftArray : "+Arrays.toString(leftarray));
		System.out.println("rightArray : "+Arrays.toString(rightarray));
		//merging leftarray and rightarray
		i=0;
		j=0;
		k=start;
		while(i<n1 && j<n2) {
			if(leftarray[i]<rightarray[j]) {
				arr[k]=leftarray[i];
				i++;
				k++;
			}else {
				arr[k]=rightarray[j];
				j++;
				k++;
			}
			
		}
		while(i<n1) {
			arr[k]=leftarray[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightarray[j];
			j++;
			k++;
		}
		
		System.out.println("Array : "+Arrays.toString(arr));
	}

}
