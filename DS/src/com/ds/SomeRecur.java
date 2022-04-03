package com.ds;

import java.util.Arrays;

class OddFunction {
    boolean run(int num) {
        if (num % 2 == 0) { 
            return false; }
       else {
           return true;
       }
    }
  }

public class SomeRecur {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,6};
		OddFunction odd = new OddFunction();
        System.out.println(someRecursive(arr, odd));
	}
	
	
	 public static boolean someRecursive(int[] arr, OddFunction odd) {
	        // TODO
		 
		 Boolean res = false;
		 while(res == false)
		 {
			 if(arr.length == 0)
			 {
				 return false;
			 }
			 if(odd.run(arr[arr.length-1]))
		        {
		            res = true;
		        }
			
			 
			 arr = Arrays.copyOfRange(arr, 0, arr.length-1); 
			 someRecursive(arr,odd);
			 
			 
		 }
		 return res;
			 
			 
	       
	    }

	}




