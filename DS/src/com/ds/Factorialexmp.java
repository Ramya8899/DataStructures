package com.ds;

import java.util.Scanner;

public class Factorialexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter number");
		Scanner sc = new Scanner(System.in);
		 int res = sc.nextInt();
		
	
		System.out.println(Factorial(res));

	}
	
	public static int Factorial(int num)
	{
		int res = 1;
		
		if(num > 1)
		{
		res = num*Factorial(num-1);
		}
		
		return res;
	}

}
