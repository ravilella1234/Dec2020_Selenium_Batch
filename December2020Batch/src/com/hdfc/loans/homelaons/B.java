package com.hdfc.loans.homelaons;

public class B extends A // IS-A Relationship
{

	public void m1()
	{
		System.out.println("iam overriden m1 from ClassB");
	}
	
	public void m2()
	{
		System.out.println("iam m2 from ClassB");
	}
	
	public static void main(String[] args) 
	{
		A a = new A();  // HAS-A Relationship
		a.m1();
		System.out.println(a.x);
		
		B b = new B();
		b.m2();
		b.m1();
		System.out.println(b.x);
	}
}
