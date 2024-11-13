package com.demo.test;

import java.util.Scanner;

import com.demo.lists.Graph;

public class AdjescencyList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many vertices?");
		int v=sc.nextInt();		
		Graph g=new Graph(v);
		StoreGraph(g,v);
		g.printGraph();

	}
	private static void StoreGraph(Graph g,int v) {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.println("Is there a edge between "+i+"----"+j);
				int val=sc.nextInt();
				if(val==1) {
					//for unweighted graph
					g.addEdge(i, j);
					//this is for weighted graph
					//g.addEdge(i,j,val);
				}
				
			}
		}
		
	}


}
