package com.hdfc.loans.carlaons;

public class ThirdClass 
{
	//properties - data
	int a=10,b=20,c;
	
	
	//behaviours - operations
	public void add()
	{
		c=a+b;
		System.out.println("Addition of A & b is : " + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("sub of A & B is : " + c);
	}
	
	

	public static void main(String[] args) 
	{		
		ThirdClass obj = new ThirdClass();
		obj.add();
		obj.sub();
		
		ThirdClass obj1 = new ThirdClass();
		obj1.add();
		obj1.sub();
	}

}
