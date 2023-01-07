package com.in29minutes.oops.level2;

public class Customer {
	//state
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	//creating
	public Customer(String name, Address homeAddress) {
		this.name= name;
		this.homeAddress = homeAddress;
	}
	
	//operations
	public Address getHomeaddress() {
		return homeAddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeAddress = homeaddress;
	}

	public Address getWorkaddress() {
		return workAddress;
	}

	public void setWorkaddress(Address workaddress) {
		this.workAddress = workaddress;
	}
	
	public String toString() {
		return String.format("name - [%s] home address - [%s] work address - [%s]", name, homeAddress, workAddress);
	}
	
	
}
