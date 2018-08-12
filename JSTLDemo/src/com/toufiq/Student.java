package com.toufiq;

public class Student {

	int rollNo;
	String name;
	
	public  Student(int roll,String name) {
		this.name = name;
		this.rollNo = roll;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
	
	
	
}
