package com.demo.Graph;

import com.demo.lists.MyLinkedList;

public class Graph {
	private MyLinkedList[] g;
	public Graph(int v) {
		g= new MyLinkedList[v];
		for(int i=0;i<v;i++)
			g[i]=new MyLinkedList();
	}
	public void addEdges(int source , int destination) {
		g[source].addNode(destination);
	}
	public void printGraph() {
		for(int i=0;i<g.length;i++) {
			System.out.print(i+"===>");
			g[i].displayList();
		}
	}
}