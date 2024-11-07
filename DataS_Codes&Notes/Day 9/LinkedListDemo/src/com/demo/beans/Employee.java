package com.demo.beans;

public class Employee {
      private int empid;
      private String ename;
      private String addr;
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, String addr) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.addr = addr;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", addr=" + addr + "]";
	}
      
}
