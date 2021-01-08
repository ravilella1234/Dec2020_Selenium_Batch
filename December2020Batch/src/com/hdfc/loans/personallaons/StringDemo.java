package com.hdfc.loans.personallaons;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = " Ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.hashCode());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.substring(3, 8));
		System.out.println(s1.replace('R', 'K'));
		System.out.println(s1.replaceAll("Ra", "KA"));
		
		
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		
		//Comparisions
		
		String s3 ="ravi";
		String s4 ="Rav";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.contains(s4));
		System.out.println(s3.contains(s4.toLowerCase()));
		
		String s5 ="ravikanth";
		System.out.println(s1.equals(s5));
		System.out.println(s1.toLowerCase().trim().equals(s5));
		System.out.println(s1.trim().equalsIgnoreCase(s5));
		
		System.out.println(s1.startsWith(" Ra"));
		System.out.println(s1.endsWith("nth"));
		
		String s6 = "ravi_kanth_Lella";
		String[] str = s6.split("_");
		System.out.println(str[1]);
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
	}

}
