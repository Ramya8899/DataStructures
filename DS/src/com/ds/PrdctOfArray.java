package com.ds;

public class PrdctOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,2,3,4,5};
		System.out.println(productofArray(A,A.length));

	}
	
	public static int productofArray(int A[], int N)
	{
		if(N-1<0)
		{
			return 1;
		}
		else
		{
			System.out.println(N-1);
			return A[N-1]*productofArray(A,N-1);
		}
		
	}

}
