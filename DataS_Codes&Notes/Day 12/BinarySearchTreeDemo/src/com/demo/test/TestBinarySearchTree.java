package com.demo.test;

import com.demo.trees.BinarySearchTree;

public class TestBinarySearchTree {
public static void main(String[] args) {
	BinarySearchTree bt=new BinarySearchTree();
	/*
	 *         60
	 *        /  \
	 *      35   75
	 *     / \   / \
	 *   20  40 70 85
	 */
	bt.insertValue(60);
	bt.insertValue(35);
	bt.insertValue(75);
	bt.insertValue(20);
	bt.insertValue(40);
	bt.insertValue(70);
	bt.insertValue(85);
	
	bt.inorder();
	bt.preorder();
	bt.postorder();
	if(bt.binarysearchValue(75)) {
		System.out.println("data found ");
	}else {
		System.out.println("data not found");
	}
	if(bt.binarysearchValue(100)) {
		System.out.println("data found ");
	}else {
		System.out.println("data not found");
	}
	
}
}
