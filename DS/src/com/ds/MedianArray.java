package com.ds;

import java.util.Arrays;

public class MedianArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {2,1};
		int[] nums2 = {3};
		
		System.out.println(findMedianSortedArrays(nums1,nums2));

	}
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 
		 double median;
		 int len = nums1.length+nums2.length;
		 
		 int[] ar = new int[len];
		 
		 for(int i=0;i<nums1.length;i++)
		 {
			 ar[i] = nums1[i];
			
		 }
		 for(int i=nums1.length;i<len;i++)
		 {
			 
			 ar[i] = nums2[i-nums1.length];
			 
		 }
		 Arrays.sort(ar);
		if(len%2 != 0)
		{
			
			median = ar[len/2];
		}
		else
		{
			System.out.println("len "  +len);
			int index = len/2 - 1;
			System.out.println(index);
			System.out.println(ar[len/2]);
			System.out.println(ar[index]);
			median = (double)(ar[len/2]+ar[index])/(double)2;
			
			
		}
		 
		return median;
	        
	    }

}
