package com.demo.trees;

public class BinarySearchTree {
class Node{
	Node left;
	int data;
	Node right;
	public Node(int val) {
		this.left=null;
		this.right=null;
		data=val;
	}
	
}
Node root;
public BinarySearchTree() {
	this.root = null;
}

public void insertValue(int val) {
	root=insertData(root,val);
	//System.out.println(root.data);
}

private Node insertData(Node root,int val) {
	Node newnode=new Node(val);
	if(root==null) { //tree is empty
		root=newnode;
		return root;
	}
	//add in left tree
	if(val<root.data) {
			root.left=insertData(root.left,val);
	}else {
			//add in right tree
			root.right=insertData(root.right,val);
		}
	
	return root;
}

public void inorder() {
	inorderTraversal(root);
	System.out.println("-----------------");
}

private void inorderTraversal(Node root) {
	if(root!=null) {
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
	}
}

public void preorder() {
	preorderTraversal(root);
	System.out.println("-----------------");
}

private void preorderTraversal(Node root) {
	if(root!=null) {
		System.out.println(root.data);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
}

public void postorder() {
	postorderTraversal(root);
	System.out.println("-----------------");
}

private void postorderTraversal(Node root) {
	if(root!=null) {
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.println(root.data);
	}
}

public boolean binarysearchValue(int val) {
	return binarySearchData(root,val);
}

private boolean binarySearchData(Node root,int val) {
	//return true if data found else false
	if(root==null)
		return false;
	if(root.data==val) {
		return true;
	}
	else if(val<root.data){
		return binarySearchData(root.left,val);
	}else {
		return binarySearchData(root.right,val);
	}
	
}


}
