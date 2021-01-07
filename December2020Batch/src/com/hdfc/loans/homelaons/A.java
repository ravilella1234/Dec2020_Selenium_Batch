package com.hdfc.loans.homelaons;

import java.util.Date;

public  abstract class A 
{
	public final static  float x=100;
	
	
	public abstract void  m8();
	
	public void m1()
	{
		
		System.out.println("iam m1 from ClassA");
	}
	
	public static void m5()
	{
		System.out.println("iam m5 static");
	}
	
	
	static
	{
		System.out.println("iam static 1st block");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		A.m5();
	}

}
