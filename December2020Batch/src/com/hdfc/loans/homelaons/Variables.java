package com.hdfc.loans.homelaons;

public class Variables 
{
	//primitive variable
	int x=100; // instance (or) global (or) non-static 
	static String cname = "vmware"; // static (or) global
	static float roi = 8.5f;
	static Variables obj;
	
	public void m1()
	{
		int x=200; // local
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(Variables.cname);
	}
	
	
	public static void m2()
	{
		obj = new Variables();
		System.out.println(obj.x);
		System.out.println(Variables.cname);
		System.out.println(Variables.roi);
	}
	
	public static void m3()
	{
		
	}

	public static void main(String[] args) 
	{
		obj = new Variables(); // reference variable
		System.out.println(obj.x);
		System.out.println(obj.x);
		System.out.println(Variables.cname);
		System.out.println(Variables.roi);	
	}

}
