package com.ds;

import java.util.Arrays;

public class s2Darray {
	
	int[][] arr = null;
	
	public s2Darray(int row,int col)
	{
		this.arr = new int[row][col];
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr.length+" : "+arr[0].length);
			for(int j =0;j<arr[0].length;j++)
			{
				arr[i][j] = Integer.MIN_VALUE;
			}
		}
		System.out.println(Arrays.deepToString(arr));
		
	}
	
	
	
	public void inserttoarray(int row,int column,int value)
	{
		arr[row][column] = value;
	}
	

}
