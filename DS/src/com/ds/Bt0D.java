package com.ds;

public class Bt0D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2000000%3);
		System.out.println(Bt0Dexmp(13));
		//Bt0Dexmp(13);
		
		

	}
	
	public static int Bt0Dexmp(int num)
	
	{
		
		
		if(num==0)
		{
			
			
			return 0;
		}
		
		return num%2+10*Bt0Dexmp(num/2);
	}

}
  