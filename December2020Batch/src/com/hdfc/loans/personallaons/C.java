package com.hdfc.loans.personallaons;

import com.hdfc.loans.homelaons.A;
import com.hdfc.loans.homelaons.B;

public class C extends A
{
	public void m1()
	{
		System.out.println("iam overriden m1 from ClassC");
	}
	
	
	public void m3()
	{
		System.out.println("iam m3 from ClassC");
	}
	
	public static void main(String[] args) 
	{
		
		A a  = new A();
		a.m1();
			
		A obj = new C();
		obj.m1();
		

		C c = new C();
		c.m1();
		c.m3();
	}

}
