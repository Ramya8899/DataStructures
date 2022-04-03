package com.ds;

public class PowerOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerOFnumbers(299,16));

	}
	
	public static int powerOFnumbers(int num, int power)
	{
		if(power == 1)
		{
			return num;
		}
		else
		{
			return num*powerOFnumbers(num,power-1);
		}
	}

}
