package com.ds;

import java.util.ArrayList;

public class longestPalindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("rdacqcadkgbsfd"));

	}
	
	public static  ArrayList<String> lst = new ArrayList<String>();
	public static int max=0;
	public static String longestPalindrome(String s) {
	
		String Palindrome = null;
		CheckForPalindrome(s);
		for(String s1:lst)
		{
			if(max==s1.length())
			{
				Palindrome = s1;
			}
		}
		return Palindrome;
		
	}
	
	public static void CheckForPalindrome(String s) {
		String str = null;
		if(!lst.contains(s))
		{
			StringBuilder sb = new StringBuilder(s);
			if(s.equals(sb.reverse().toString()))
			{
				if(max<s.length())
				{
					lst.add(s);
					max = s.length();
				}
				
			}
			if(s.length()<=1)
			{
				return;
			}
			CheckForPalindrome(s.substring(1,s.length()));
			 CheckForPalindrome(s.substring(0,s.length()-1));
			
		}
		
		}
		
	

}
