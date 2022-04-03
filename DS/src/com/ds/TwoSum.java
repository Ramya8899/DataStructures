package com.ds;

import java.util.ArrayList;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5};
		System.out.println(twosumexmp(ar,9));
		

	}
	
	public static int[] twosumexmp(int[] arr,int target)
	{
		int[] ar = new int[2];
		for(int i =0;i<arr.length-1;i++)
		{
			for(int j =0;j<arr.length;j++)
			{
			if(arr[i]+arr[j] == target)
			{
				
				ar[0] = i;
				ar[1] = j;
				break;
			}
			}
		}
		
		
		return ar;
		
	}

}
