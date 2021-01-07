package com.hdfc.loans.personallaons;

public class EmployeeChild extends Employee
{
	String address;

	public EmployeeChild(String address) 
	{
		super(1745,"sai",12.34f);
		this.address=address;
		System.out.println(this.address);
	}
	
	void m1()
	{
		
	}

	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("hyderabad");
		
	}

}
