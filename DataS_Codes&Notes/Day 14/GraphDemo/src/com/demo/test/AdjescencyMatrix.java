package com.demo.test;

import java.util.Scanner;

public class AdjescencyMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many vertices?");
		int v=sc.nextInt();		
		int[][] g=new int[v][v];
		StoreGraph(g);
		displayMatrix(g);

	}
	
	///display adjescency matrix

	private static void displayMatrix(int[][] g) {
		for(int i=0;i<g.length;i++) {
			for(int j=0;j<g[0].length;j++) {
				System.out.print(g[i][j]+"\t");
				
				
			}
			System.out.println();
		}
		
	}
	
	//create adjescency matrix

	private static void StoreGraph(int[][] g) {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<g.length;i++) {
			for(int j=0;j<g[0].length;j++) {
				System.out.println("Is there a edge between "+i+"----"+j);
				g[i][j]=sc.nextInt();
				
			}
		}
		
	}

}
