package com.demo.test;

public class TestAddition {

	public static void main(String[] args) {
		int ans=addition(6);
		System.out.println("addition : "+ans);
		ans=additionrecurssive(6);
		System.out.println("addition : "+ans);
	}

	private static int additionrecurssive(int num) {
		if(num==1)
			return 1;
		return num+additionrecurssive(num-1);
					
			
	}

	private static int addition(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}

	
}
