package com.ds;

public class EuclidGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(EuclidGCDexmp(48,18));

	}
	
	public static int EuclidGCDexmp(int n1,int n2)
	{
		if(n2==0)
		{
			return n1;
		}
	
		return EuclidGCDexmp(n2,n1%n2);
		
	}

	
}
