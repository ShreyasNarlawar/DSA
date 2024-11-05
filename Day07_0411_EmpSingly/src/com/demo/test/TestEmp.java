package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlist.SinglyEmpList;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyEmpList elst = new SinglyEmpList();
		elst.addNode(new Employee(4, "DHIRAJ","ASSISTANT"));
		elst.addNode(new Employee(5, "Shreyas","Software Engineer At Google"));
		elst.addNode(new Employee(1, "harsh","manager"));
		
		elst.displayData();
		elst.deleteById(5);
		
		elst.displayData();
		
		elst.searchById(1);
		
		elst.addNode(new Employee(6, "umesh","developer"));
		elst.addNode(new Employee(2, "kailas","product manager"));
		elst.displayData();
	}

}
