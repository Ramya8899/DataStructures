package com.ds;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar1 = {1,2,3,4,5};
		int[] ar2 = {5,4,6,2,1};
		System.out.println(permutation(ar1,ar2));
		
	}
	
	public static boolean permutation(int[] ar1, int[] ar2)
	{
		boolean flag = true;
		int count =0;
		if(ar1.length!=ar2.length)
		{
			flag = false;
		}
		else
		{
			
		for(int i=0;i<ar1.length;i++)
		{
			
			for(int j=0;j<ar2.length;j++)
			{
				if(ar1[i]==ar2[j])
				{
					count++;
				}
			}
			
		}
		}
		if(count != ar1.length)
		{
			flag = false;
		}
		
		return flag;
		
	}

}
