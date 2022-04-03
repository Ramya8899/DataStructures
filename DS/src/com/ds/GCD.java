package com.ds;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCDnum(8,4,5));
		
	}
	
	public static int GCDnum(int num1,int num2,int div)
	{
		div = div-1;
		
		if (div > 2 && num1 % div == 0 && num2 % div ==0)
		{
			
			return div;
			
		}
		
		
		
		
		return GCDnum(num1,num2,div);
	}

}
