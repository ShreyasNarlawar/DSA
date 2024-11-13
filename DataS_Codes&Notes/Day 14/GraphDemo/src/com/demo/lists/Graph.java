package com.demo.lists;

import com.demo.queues.MyListQueue;
import com.demo.stacks.MyListStack;

public class Graph {
	private MyLinkedList[] g;
	public Graph(int v) {
		g=new MyLinkedList[v];
		for(int i=0;i<v;i++) {
			g[i]=new MyLinkedList();
		}
	}
	
	public void addEdge(int source,int destination) {
		g[source].addValue(destination);
	}
	
	public void printGraph() {
		for(int i=0;i<g.length;i++) {
			System.out.print(i+"===>");
			g[i].displayList();
		}
		
	}
	public void BFSTraversal(int start) {
		System.out.println("BFS traversal");
		//create a visited array of size = number of vertices, and mark all values to false
		boolean[] visited=new boolean[g.length];
		for(int i=0;i<visited.length;i++) {
			visited[i]=false;
		}
		//create a Quesue and enqueue the starting element in the queue, mark it as visited
		MyListQueue q=new MyListQueue();
		visited[start]=true;
		q.enqueue(start);
		
		while(!q.isEmpty()) {
			//pop element from the stack
			int v=q.dequeue();
			System.out.print(v+", ");
			//to get all adjescent nodes of v
			int[] arr=new int[g.length];
			for(int i=0;i<arr.length;i++) {
				 arr[i]=-1;
			}
			g[v].getAdjescentNodes(arr);
			for(int i=0;arr[i]!=-1 && i<arr.length;i++) {
				if(!visited[arr[i]]) {
					visited[arr[i]]=true;
					q.enqueue(arr[i]);
				}
			}
		   
		}
		
	}
	
	public void DFSTraversal(int start) {
		System.out.println("DFS traversal");
		//create a visited array of size = number of vertices, and mark all values to false
		boolean[] visited=new boolean[g.length];
		for(int i=0;i<visited.length;i++) {
			visited[i]=false;
		}
		//create a stack and push the starting element in the stack
		MyListStack s=new MyListStack();
		s.push(start);
		while(!s.isEmpty()) {
			//pop element from the stack
			int v=s.pop();
			if(!visited[v]) { //visited[v]==false
			   System.out.print(v+", ");
			   //mark visited true
			   visited[v]=true;
			   //to get all adjescent nodes of v
			   int[] arr=new int[g.length];
			   for(int i=0;i<arr.length;i++) {
				   arr[i]=-1;
			   }
			   g[v].getAdjescentNodes(arr);
			   //push them into stack 
			   for(int i=0;i<arr.length;i++) {
				   if(arr[i]!=-1) // && !visited[arr[i]])
					   s.push(arr[i]);
			   }
			}
		   
		}
	}

}
