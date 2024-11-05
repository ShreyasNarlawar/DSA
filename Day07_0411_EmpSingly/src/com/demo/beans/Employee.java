package com.demo.beans;

public class Employee {
	private int empid;
	private String ename;
	private String jobrole;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String ename, String jobrole) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.jobrole = jobrole;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJobrole() {
		return jobrole;
	}

	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", jobrole=" + jobrole + "]";
	}
	

}
