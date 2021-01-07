package com.hdfc.loans.carlaons;

public interface Rbi 
{
	
	
	public void withdrawl();
	public void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i1 = new Rbi();
		
		Rbi i;
		
		i = new ICICI();
		i.deposit();
		i.withdrawl();
		
		i =new HDFC();
		i.deposit();
		i.withdrawl();
		
	}

}
