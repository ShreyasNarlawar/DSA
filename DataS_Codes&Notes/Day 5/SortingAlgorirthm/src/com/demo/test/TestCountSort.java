package com.demo.test;

import java.util.Arrays;

public class TestCountSort {
	public static void main(String[] args) {
		int[] arr= {4,2,2,8,3,3,1};
		System.out.println("Before sort");
		System.out.println(Arrays.toString(arr));
		int[] sorteddata=countingSort(arr);
		System.out.println("After sort");
		System.out.println(Arrays.toString(sorteddata));
	}

	private static int[] countingSort(int[] arr) {
		//find max
		int max=findmax(arr);
		//create a array of size max+1
		int[] counter=new int[max+1];
		//find occurences of every number
		for(int i=0;i<arr.length;i++) {
			//int idx=arr[i];
			//counter[idx]++;
			counter[arr[i]]++;
		}
		System.out.println("couter array");
		System.out.println(Arrays.toString(counter));
		
		//find cumulative sum
		for(int i=1;i<counter.length;i++) {
			counter[i]=counter[i]+counter[i-1];
		}
		System.out.println("cummulative sum couter array");
		System.out.println(Arrays.toString(counter));
		//create a output array
		int[] output=new int[arr.length];
		
		//fill the values in output array
		for(int i=0;i<arr.length;i++) {
			/*int idx=arr[i];
			int pos=counter[idx]-1;
			counter[idx]--;
			output[pos]=arr[i]*/
			
			output[counter[arr[i]]-1]=arr[i];
			counter[arr[i]]--;
			
		}
		return output;
		
		
	}

	private static int findmax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
