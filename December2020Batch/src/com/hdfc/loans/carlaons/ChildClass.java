package com.hdfc.loans.carlaons;

public class ChildClass extends FirstAbstarct
{

	public static void main(String[] args) 
	{
		ChildClass obj = new ChildClass();
		obj.m1();
		obj.m2();

	}
	
	
	public void m1()
	{
		System.out.println("iam overriden m1  from ChildClass....");
	}

	@Override
	public void m2() 
	{
		System.out.println("iam overriden m2 in ChildClass... ");
	}

}
