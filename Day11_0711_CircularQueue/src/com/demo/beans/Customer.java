package com.demo.beans;

public class Customer {
	private int id;
	private String name;
	private double salary;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
