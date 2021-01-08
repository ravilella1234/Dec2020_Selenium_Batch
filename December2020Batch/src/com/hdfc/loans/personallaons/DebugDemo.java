package com.hdfc.loans.personallaons;

import java.util.Scanner;

public class DebugDemo 
{
	
	public int m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int asize = sc.nextInt();
		int[] c = new int[asize];
		int sum=0;
		
		System.out.println("Enter the array Elements: ");
		int k=0;
		while(k<c.length)
		{
			c[k]=sc.nextInt();
			System.out.println("c["+k+"]="+c[k]);
			sum = sum +c[k];
			k++;	
		}
		System.out.println("Sum of Array is : " + sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		DebugDemo obj = new DebugDemo();
		int count = obj.m1();
		System.out.println("Count of Array in outside :  " + count);

	}

}
