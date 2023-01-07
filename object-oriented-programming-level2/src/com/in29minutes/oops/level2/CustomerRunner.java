package com.in29minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1", "Hyerabad", "50035");
		Customer customer = new Customer("Ranga", homeAddress);
		
		Address workAddress = new Address("line 1 for work", "Hyerabad", "50078");
		customer.setWorkaddress(workAddress);
		
		System.out.println(customer);

	}

}
