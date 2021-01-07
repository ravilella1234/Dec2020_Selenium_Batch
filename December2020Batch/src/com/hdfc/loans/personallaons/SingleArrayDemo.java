package com.hdfc.loans.personallaons;

import java.util.Scanner;

public class SingleArrayDemo 
{

	public static void main(String[] args) 
	{
		
		/*
		 * int[] a= {10,20,30,40,50}; for(int i=0;i<a.length;i++) {
		 * System.out.println("a["+i+"]="+a[i]); }
		 */
		 
		
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
		
		/*
		 * int[] b = new int[] {10,20,30}; for(int j=0;j<b.length;j++) {
		 * System.out.println("b["+j+"]="+b[j]); }
		 */
	}

}
