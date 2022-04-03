package com.ds;

public class longestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("babad"));

	}
	
	
	public static String longestPalindrome(String s) {
		String pal = new String();
		for(int i =0;i<s.length();i++)
		{
			
			if(s.substring(i, s.length()-i).equals(revstr(s.substring(i, s.length()-i))))
			{
				 pal = s.substring(i, s.length()-i);
				break;
			}
			
		}
		
		return pal;
		
        
    }
	
	
	public static String revstr(String str)
	{
		if(str.length() == 1)
		{
			return str;
		}
		return String.valueOf(str.charAt(str.length()-1)+revstr(str.substring(0,str.length()-1)));
	}

}
