package com.ds;

public class SumOfDigOfPstvNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumdig(143));

	}
	
	public static int sumdig(int num)
	{
		if(num<10)
		{
			return num;
		}
		else
		{
			return num%10+sumdig(num/10);
		}
		
	}

}
