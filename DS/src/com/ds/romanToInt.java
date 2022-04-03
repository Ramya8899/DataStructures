package com.ds;

import java.util.HashMap;

public class romanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		romanToIntimp("MCMXCIV");

		
		
	}
	
	
	public static int romanToIntimp(String str)
	{
		int res =0;
		
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("I", 1);
		hs.put("V", 5);
		hs.put("X", 10);
		hs.put("L", 50);
		hs.put("C", 100);
		hs.put("D", 500);
		hs.put("M", 1000);
		
		for(int i =0;i < str.length()-1;i++ )
		{
			
			if(hs.get(str.valueOf(str.charAt(i))) >= hs.get(str.valueOf(str.charAt(i+1))))
			{
				res =res + hs.get(str.valueOf(str.charAt(i)));
				
			}
	
			if(hs.get(str.valueOf(str.charAt(i))) < hs.get(str.valueOf(str.charAt(i+1))))
			{
				res =  res + (hs.get(str.valueOf(str.charAt(i+1)))-hs.get(str.valueOf(str.charAt(i))));
				i++;
			}
		}
		if(hs.get(str.valueOf(str.charAt(str.length()-1))) == hs.get(str.valueOf(str.charAt(str.length()-2))))
		{
		
		res =res + hs.get(str.valueOf(str.charAt(str.length()-1)));
		}
		
		
		
		return res;
		
	}

}
