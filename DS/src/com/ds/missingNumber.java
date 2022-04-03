package com.ds;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = {1,2,3,4,5,6,8,9,10};
		System.out.println(missingNumber(intArray));
		
	}
	
	public static int[] missingNumber(int[] intArray) {
		
		int counter = 1;
		int[] missing = new int[1];
		for(int i=0;i<intArray.length;i++)
		{
			if (!(intArray[i]==counter))
					{
				missing[0] = counter;
				//System.out.println(counter);
				break;
					}
			counter++;
		}
		return missing;
		
        // TODO
    }

	
	
	

}
