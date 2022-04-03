package com.ds;

import java.util.Arrays;

public class ArrayInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = new int[3];
		
		s2Darray arr = new s2Darray(3, 2);
		arr.inserttoarray(0, 0, 1);
		arr.inserttoarray(0, 1, 2);
		arr.inserttoarray(1, 0, 3);
		arr.inserttoarray(1, 1, 4);
		
		System.out.println(Arrays.deepToString(arr.arr));
		System.out.println(Arrays.toString(arr.arr[0]));
		

	}

}
