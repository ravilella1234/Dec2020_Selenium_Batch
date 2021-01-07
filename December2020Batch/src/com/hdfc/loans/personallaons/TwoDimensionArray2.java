package com.hdfc.loans.personallaons;

public class TwoDimensionArray2 
{

	public static void main(String[] args) 
	{
		int p[][] = new int[3][3];
		
		p[0][0]=10;
		p[0][1]=20;
		p[0][2]=30;
		
		p[1][0]=40;
		p[1][1]=50;
		p[1][2]=60;
		
		p[2][0]=70;
		p[2][1]=80;
		p[2][2]=90;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(p[i][j] + "  ");
			}
			System.out.println();
		}
		
		for(int k[]:p)
		{
			for(int l:k)
			{
				System.out.print(l +"  ");
			}
			System.out.println();
		}

	}

}
