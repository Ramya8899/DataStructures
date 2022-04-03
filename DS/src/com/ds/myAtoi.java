package com.ds;

public class myAtoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " -1234 words";
		System.out.println(myAtoi(s));
		
		 
	}
	
	
		public static int myAtoi(String s) {
			StringBuilder b = new StringBuilder();
			int res;
			s = s.trim();
			
			if(s.charAt(0) == '-' || s.charAt(0) == '+')
			{
				b.append(s.charAt(0));
			}

			
			  for(int i=0;i<s.length();i++)
			  {
				  int ascii = Integer.valueOf(s.charAt(i));
				  if(ascii >= 48 && ascii <= 57)
				  {
					  b.append(s.charAt(i));
				  }
			  }
			  res = Integer.valueOf(b.toString());
	
	
	
	return res;
        
    }

}
