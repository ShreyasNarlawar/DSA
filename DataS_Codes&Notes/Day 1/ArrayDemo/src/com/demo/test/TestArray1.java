package com.demo.test;

import com.demo.service.ArrayService;

public class TestArray1 {
	

	public static void main(String[] args) {
		int[] arr= {30,12,13,11,2,4,12};
		int max=ArrayService.findMax(arr);
		System.out.println("Mximum : "+max);
        int max2=ArrayService.findSecondMax(arr);
        System.out.println("2 nd max : "+max2);
        //write a function to find addition of all prime numbers
        int sum=ArrayService.findPrimeSum(arr);
        System.out.println("Addition : "+sum);
        int val=7;
        int pos=ArrayService.sequentialSearch(arr,val);
        if(pos!=-1) {
        	System.out.println("number found at : "+pos);
        }else {
        	System.out.println("not found");
        }
        
	}

}
