package com.demo.test;

import com.demo.BinarySearchTrees.BinarySearch;
import com.demo.BinarySearchTrees.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		
//		BinarySearch bst = new BinarySearch();
		bst.insertNumber(30);
		bst.insertNumber(40);
		bst.insertNumber(25);
		bst.insertNumber(22);
		bst.insertNumber(42);
		bst.insertNumber(35);
		bst.insertNumber(36);
		bst.insertNumber(7);
		bst.insertNumber(10);
		bst.insertNumber(27);
		bst.insertNumber(21);
		bst.insertNumber(40);
		bst.insertNumber(45);
		bst.inOrder();
		bst.PreOrder();
		bst.PostOrder();


		if(bst.SearchNumber(7))
			System.out.println("Number found..");
		else
			System.out.println("Number not found");
	}

}
