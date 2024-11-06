package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlist.SinglyEmployeeList;

public class TestEmployeeList {

	public static void main(String[] args) {
		SinglyEmployeeList elist=new SinglyEmployeeList();
		elist.addNode(new Employee(1,"Rajan","xxxx"));
		elist.addNode(new Employee(2,"Rohit","yyyyy"));
		elist.addNode(new Employee(3,"Sameer","zzzzz"));
		elist.addNode(new Employee(4,"Sonali","sssss"));
		elist.displayData();
		elist.searchById(3);
		elist.searchById(13);
		//elist.deleteById(3);
		//elist.deleteById(4);
		//elist.deleteById(1);
		elist.deleteById(11);
		elist.displayData();
	}

}
