package com.demo.lists;

import com.demo.queue.MyListQueue;
import com.demo.stack.MyListStack;

public class Graph {
	
	private MyLinkedList [] g;
	
	public Graph(int v) {
		g = new MyLinkedList[v];
		
		for(int i = 0; i < g.length; i++) {
			g[i] = new MyLinkedList();
		}
	}
	
	public void addEdge(int source, int destination) {
		g[source].addNode(destination); 
	}
	
	public void printGraph() {
		
		for(int i = 0; i < g.length;i++) {
			System.out.print(i + "---->");
			g[i].displayList();
		}
		System.out.println();
	}
	
	public void BFSTraversal(int start) {
		System.out.println("In BFS");
		boolean[] visited = new boolean[g.length];
		
		for(int i = 0; i < g.length; i++) {
			visited[i] = false;
		}
		
		MyListQueue q = new MyListQueue();
		visited[start] = true;
		q.enqueue(start);
		
		while(!q.isEmpty()) {
			int v = q.dequeue();
			System.out.println(v + " ,");
			
			int []arr = new int [g.length];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = -1;
			}
			g[v].getAdjancentNodes(arr);
			for(int i = 0; arr[i] != -1 && i < arr.length; i++) {
				if(!visited[arr[i]]) {
					visited[arr[i]] = true;
					q.enqueue(arr[i]);
				}
			}
			if (!q.isEmpty())
	            System.out.print(", "); 
	    }
	    System.out.println(); 		
	}
	public void DFSTraversal(int start) {
		System.out.println("In DFS ");
		boolean[] visited = new boolean[g.length];
		
		for(int i = 0; i < visited.length; i++)
			visited[i] = false;

		MyListStack s = new MyListStack();
		s.push(start);
		
		while(!s.isEmpty()) {
			 int v = s.pop();
			System.out.print(v + ", ");
			if(!visited[v]) {
				visited[v] = true;
				int []arr = new int [g.length];
				for(int i = 0; i < arr.length; i++)
					arr[i] = -1;
				g[v].getAdjancentNodes(arr);
				for(int i = 0; i < arr.length; i++)
					if(arr[i] != -1)
						s.push(arr[i]);
			}
		}
		System.out.println();
		
	}
}
