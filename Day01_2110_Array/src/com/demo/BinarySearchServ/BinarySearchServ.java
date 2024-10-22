package com.demo.BinarySearchServ;

public class BinarySearchServ {

	public static int searchElement(int arr[], int l, int h, int num) {
		
		if(l <=h) {
		int mid = (l + h)/2;
		
		
		if(arr[mid] == num)
			return mid;
		else if(arr[mid] > num )
			return searchElement(arr,l,mid-1,num);
		else
			return searchElement(arr,mid+1,h,num);	
		}
		return -1;
	}
}
