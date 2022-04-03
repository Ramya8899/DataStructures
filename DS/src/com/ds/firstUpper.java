package com.ds;

import java.util.Arrays;

public class firstUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(capitalizeWord("i love you"));
		

	}
	
	
	
	static char first(String str) {
		
		char ch = str.charAt(str.length()-1);
		if(str.length() == 0)
		{
			return 0;
		}
		if(ch >= 'A' && ch <= 'Z')
		{
			return ch;
		}
		else
		{
			return first(str.substring(0, str.length()-1));
		}
	
	    }
	
	static int counter = 0;
	
	 public static String capitalizeWord(String str){
		    //   TODO
		 if(counter == str.length())
		 {
			 return str;
		 }
		 
		 else
		 {
		
		if (counter == 0)
		{
					
		str = str.replace(str.charAt(0),Character.toUpperCase(str.charAt(0)));
			
		}
		if (str.charAt(counter) == ' ')
		{
		
		str = str.replace(str.charAt(counter+1),Character.toUpperCase(str.charAt(counter+1)));
		
		
		}
		counter++;
		
		
		return capitalizeWord(str);
		
		 }
		
		  }  


}
