package com.ds;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class DtoB {

	static HashMap<Integer, Integer> hashh = new HashMap<Integer, Integer>();
	static int res = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DtoBspliter(1100);
		
		hashh.forEach((k, v)
                -> System.out.println(k + " : "
                                      + (v)));
		
		
		for (Entry<Integer, Integer> mapElement : hashh.entrySet()) {
			if(mapElement.getKey() == 0)
			{
				res = res + 2;
			}
			else
			{
				res = res + powercal(mapElement.getKey(),mapElement.getValue());
			}
		}
		System.out.println(res);
			 
		
		
		

	}
	
	
	public static void DtoBspliter(int n)
	{
		
		 
		
		if(n>0)
		{
			
			
			int res = n%10;
			
			int len = String.valueOf(n).length();
			hashh.put((len-1), res);
			
			
			
			DtoBspliter(n/10);
			
		}
		
		
		
	}
	
	public static int powercal(int i,int dec){
		
		int res = 1;
		if (i==0 || dec == 0)
		{
			return 1;
		}
		else
		{
			res = 2*powercal(i-1,dec);
			
		}
		return res;
		
	}
	

}
