package com.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayPartision {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> orignal = new ArrayList<Integer>();
		orignal.add(1);
		orignal.add(2);
		orignal.add(3);
		orignal.add(4);
		orignal.add(5);
		orignal.add(6);
		orignal.add(7);
		orignal.add(8);
		
		
		
		for(int i=0;i<orignal.size();i+=3)
		{
			//List<Integer> slice =  new ArrayList<Integer>();
			List<Integer> slice =	orignal.subList(i, Math.min(i+3,orignal.size() ));
			if(slice.size()==3)
			{
				Collections.reverse(slice);
			}
			
			for(int j=0;j<slice.size();j++)
			{
				System.out.print(slice.get(j));
			}
			System.out.println();
			
			
			
		}
		
	
			
		}

	}


