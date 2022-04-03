package com.ds;

import java.util.Arrays;

public class Maximumpop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] range = {{1993,1999},{1999,2010},{2012,2020}};
		
		System.out.println(maximumPopulation(range));

	}
	
	 public static int maximumPopulation(int[][] logs) {
		 
		 int p = 1;
		int min =0;	
			
			for(int i =0;i<logs.length-1;i++)
			{
				System.out.println(logs[i][0] +"<="+ logs[i+1][0]+" && "+logs[i+1][0]+" <= "+logs[i][1]);
				
				if(logs[i][0] <= logs[i+1][0] && logs[i+1][0] <= logs[i][1])
				{
					 min =  min + logs[i+1][0];
					p++;
				}
			}
		 
		
		return min;
	 }
	 }


