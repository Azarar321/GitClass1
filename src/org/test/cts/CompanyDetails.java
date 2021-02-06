package org.test.cts;

import org.test.hcl.ClientDetails;

public class CompanyDetails {
	
	private void compId() {
		System.out.println("Company id is 1234");
	}
	
	private void compName() {
		System.out.println("Company name is Cognizant");
	}
	
	private void compAddress() {
		System.out.println("Company Address is OMR");

	}
	
	public static void main(String[] args) {
		CompanyDetails c=new CompanyDetails();
		c.compId();
		c.compName();
		EmployeeDetails e=new EmployeeDetails();
		e.empId();
		e.empName();
		ClientDetails c1=new ClientDetails();
		c1.clientId();
		c1.clientName();
	}

}
