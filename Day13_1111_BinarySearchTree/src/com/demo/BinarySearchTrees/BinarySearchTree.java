package com.demo.BinarySearchTrees;

public class BinarySearchTree {
	class Node{
		Node left;
		int data;
		Node right;
		public Node(int val) {
			this.left=null;
			this.right = null;
			data=val;
		}
	}
	Node root;

	public BinarySearchTree() {
		this.root=null;
	}

	public void insertNumber(int num) {
		root=insertData(root,num);
	}

	private Node insertData(Node root , int val) {
		Node newnode = new Node(val);
		if(root == null) {
			root=newnode;
			return root;
		}
		if(val < root.data)
			root.left = insertData(root.left,val);
		else
			root.right=insertData(root.right,val);
		return root;
	}

	public void inOrder() {
		inOrderTraversal(root);
		System.out.println("<===InOrder");
	}

	private void inOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data+" ");
			inOrderTraversal(root.right);
		}
	}

	public void PreOrder() {
		preOrderTraversal(root);
		System.out.println("<===PreOrder");

	}

	private void preOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			System.out.print(root.data+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	public void PostOrder() {
		postOrderTraversal(root);
		System.out.println("<===PostOrder");

	}
	
	private void postOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	public boolean SearchNumber(int num) {
		return SearchData(root,num);
	}
	
	private boolean SearchData(Node root,int num) {
		if(root==null)
			return false;
		if(root.data==num)
			return true;
		else if(num < root.data)
			return SearchData(root.left,num);
		else
			return SearchData(root.right,num);
	}
}
