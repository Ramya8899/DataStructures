package com.ds;

public class Fibno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<=6;i++)
		{
			System.out.println(fibnoci(i));
		}
		
	}
	
	public static int fibnoci(int n)
	{
		int res;
		if(n==0 || n ==1)
		{
			
			return n;
			
		}
		
		else
		{
			res = fibnoci(n-1)+fibnoci(n-2);
			
		}
		
		return res;
	}

}
