package com.demo.BinarySearchTrees;

public class BinarySearch {
	Node root;
	class Node{
		Node left;
		Node right;
		int data;
		
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public BinarySearch() {
		root = null;
	}

	public void insertNumber(int val) {
		root = insertData(root, val);
	}

	private Node insertData(Node root, int val) {
		// TODO Auto-generated method stub
		Node newnode = new Node(val);
		if(root == null) {
			root = newnode;
			return root;
		}
		else {
			if(val < root.data) {
				root.left = insertData(root.left,val);
			}else {
				root.right = insertData(root.right,val);
			}
		}
		return root;
	}
	
	public void inOrder() {
		InorderTraversal(root);
		System.out.println("----------------");
		
	}

	private void InorderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			InorderTraversal(root.left);
			System.out.println(root.data);
			InorderTraversal(root.right);
		}
	}
	
	public void PreOrder() {
		PreorderTraversal(root);
		System.out.println("------------");
	}

	private void PreorderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			System.out.println(root.data);
			PreorderTraversal(root.left);
			PreorderTraversal(root.right);
		}
	}
	
	public void PostOrder() {
		PostOrderTraversal(root);
		System.out.println("-----------------");
	}

	private void PostOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			PostOrderTraversal(root.left);
			PostOrderTraversal(root.right);
			System.out.println(root.data);
		}
	}
	
	public boolean SearchNumber(int val) {
		return SearchData(root ,val);
	}

	private boolean SearchData(Node root, int val) {
		// TODO Auto-generated method stub
		if(root == null) {
			return false;
		}
		if(root.data == val) {
			return true;
		}
		else {
			if(val < root.data) {
				return SearchData(root.left, val);
			}else {
				return SearchData(root.right,val);
			}
		}
	}
	
	
}
