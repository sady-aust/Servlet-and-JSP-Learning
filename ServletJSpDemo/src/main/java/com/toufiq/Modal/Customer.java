package com.toufiq.Modal;

public class Customer {
	private int CustomerId;
	private int Age;
	private String Name;
	private String Address;
	private double Salary;
	
	public Customer(int customerId, int age, String name, String address, double salary) {
		
		CustomerId = customerId;
		Age = age;
		Name = name;
		Address = address;
		Salary = salary;
	}

	public Customer(int age, String name, String address, double salary) {
		super();
		Age = age;
		Name = name;
		Address = address;
		Salary = salary;
	}
	
	

	public Customer() {
		super();
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", Age=" + Age + ", Name=" + Name + ", Address=" + Address
				+ ", Salary=" + Salary + "]";
	}
	
	
	
	
}
