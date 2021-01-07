package com.hdfc.loans.personallaons;

public class TwoDimensionArray1 
{

	public static void main(String[] args)
	{
		int p[][] = {
						{1,2,3,4},
						{4,5,6},
						{7,8,9,1,2}
					};
		
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				System.out.print(p[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		for(int k[]:p)
		{
			for(int l:k)
			{
				System.out.print(l+"  ");
			}
			System.out.println();
		}
		
		

	}

}
