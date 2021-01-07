package com.hdfc.loans.personallaons;

public class Calculations 
{
	int a=10,b=20,c;
	
	
	public void add(int a, int b)
	{
		c=a+b;
		System.out.println("Add of A & B is : " + c);
	}
	
	public void sub(int a, int b)
	{
		c=a-b;
		System.out.println("Sub of A & B is : " + c);
	}
	
	public static void main(String[] args) 
	{
		Calculations c1  = new Calculations();
		c1.add(10,20);
		c1.sub(10,20);
	}

}
