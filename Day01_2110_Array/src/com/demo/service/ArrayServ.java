package com.demo.service;

public class ArrayServ {

	public static int findMax(int[] arr) {
		int max = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] >max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findSecondMax(int[] arr) {
		int max = 0;
		int smax = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				smax = max;
				max = arr[i];
			}
			if(arr[i] < max && smax < arr[i]) {
				smax = arr[i];
			}
		}
		return smax;
	}

	public static int findSumOfPrime(int[] arr) {
		int sum =0;
		for(int i =0; i < arr.length; i++) {
			if(isPrime(arr[i]))
				sum = sum + arr[i];
		}
		   return sum;
	}

	private static boolean isPrime(int num) {
		for(int i = 2; i<= num; i++ ) {
			if(num % i == 0) {
				return false;
			}
			return true;
		}
		return false;
	}

	public static int linearSearch(int[] arr, int val) {
		// TODO Auto-generated method stub\
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == val) {
				return i;
			}
		}
		return -1;
	}
	
}
