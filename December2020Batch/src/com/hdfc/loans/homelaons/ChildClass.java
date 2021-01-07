package com.hdfc.loans.homelaons;

import com.hdfc.loans.carlaons.Rbi;

public class ChildClass extends A implements Rbi
{

	public static void main(String[] args) 
	{
		ChildClass c = new ChildClass();
		c.m1();
		c.deposit();
		c.withdrawl();
		System.out.println(c.x);
		
	}

	@Override
	public void withdrawl() {
		System.out.println("withdrawl in ChiildClass");
	}

	@Override
	public void deposit() {
		System.out.println("deposit in ChiildClass");
	}

	

}
