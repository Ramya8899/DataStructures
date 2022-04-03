package com.ds;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solutionexmp("()"));
		

	}
	
	public static boolean Solutionexmp(String str)
	{
		boolean val = false;
		HashMap<String, String> hs = new HashMap<>();
		
		hs.put("{", "}");
		hs.put("[", "]");
		hs.put("(", ")");
		if(str.length()==0)
		{
			val = false;
		}
		else
		{
		
		for(int i=0;i<str.length();i++)
		{
			
		if(hs.containsKey(str.valueOf(str.charAt(i))))
		{
			String temp = str.valueOf(str.charAt(i+1));
			if(temp.equals(hs.get(str.valueOf(str.charAt(i)))))
				{
					val = true;
					i++;
				}
			else
			{
				val = false;
			}
		}
		

	}
		}
		return val;
}
}
