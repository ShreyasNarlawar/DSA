package com.demo.test;

import java.util.Scanner;

import com.demo.Graph.Graph;

public class AdjascencyList {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("How Many vertices :");
		int vertices = sc.nextInt();
		Graph graph = new Graph(vertices);
		storeGraph(vertices,graph);
		graph.printGraph();
		sc.close();
	}

	private static void storeGraph(int v,Graph g) {
		System.out.println("If yes then Enter 1 otherwise 0");
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.println("Is there Edge between"+i+"--->"+j+" :");
				int val = sc.nextInt();
				if(val==1)
					g.addEdges(i, j);
			}
		}
		sc.close();
	}
}
