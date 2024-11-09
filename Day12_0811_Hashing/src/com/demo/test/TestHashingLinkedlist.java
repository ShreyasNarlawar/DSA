package com.demo.test;

import java.util.Scanner;

import com.demo.hashing.HashingLinkedlist;

public class TestHashingLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		System.out.println("Enter size of list ");
		int num = sc.nextInt();
		
		HashingLinkedlist[] hashtable = new HashingLinkedlist[num];
		for(int i=0;i<hashtable.length;i++)
			hashtable[i]=new HashingLinkedlist();
		displayHashTable(hashtable);
		
		do {
			System.out.println(" 1.Add Data \n 2.Delete Data \n 3.Search Data \n 4.Show Data \n 5.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 ->{
					System.out.println("Enter the number");
					int val = sc.nextInt();
					
					addDataInHashtable(hashtable ,val);
					displayHashTable(hashtable);			
				}
				case 2->{
					System.out.println("Enter the number");
					int val = sc.nextInt();
					
					boolean a =deleteDataInHashtable(hashtable ,val);
					if(a)
						System.out.println("Deleted SuccessFully..");
					else
						System.out.println("Number not Found..");
					displayHashTable(hashtable);				
				}
				case 3->{
					System.out.println("Enter the number");
					int val = sc.nextInt();
					
					boolean a =searchDataInHashtable(hashtable ,val);
					if(a)
						System.out.println("Data Found SuccessFully..");
					else
						System.out.println("Number not Found..");
					displayHashTable(hashtable);			
				}
				case 4->{
					displayHashTable(hashtable);
				}
				case 5->{
					System.out.println("Thanks for your valuable time spend here...now get lost.😏😏😏");
					sc.close();
				}
				default->{
					System.out.println("Invalid Input..");
				}
			}
		}while(choice!=5);
	}

	private static boolean searchDataInHashtable(HashingLinkedlist[] hashtable, int val) {
		// TODO Auto-generated method stub
		int bucket = val % hashtable.length;
		return hashtable[bucket].search(val);
	}

	private static boolean deleteDataInHashtable(HashingLinkedlist[] hashtable, int val) {
		// TODO Auto-generated method stub
		int bucket = val % hashtable.length;
		return hashtable[bucket].deleteNode(val);
	}

	private static void displayHashTable(HashingLinkedlist[] hashtable) {
		// TODO Auto-generated method stub
		for(int i=0;i<hashtable.length;i++) {
			System.out.print(i+"---->");
			hashtable[i].displayList();
			System.out.println();
		}
		System.out.println("==================================================================");
	}

	private static void addDataInHashtable(HashingLinkedlist[] hashtable, int val) {
		// TODO Auto-generated method stub
		int bucket = val % hashtable.length;
		hashtable[bucket].addNode(val);
	}

}
