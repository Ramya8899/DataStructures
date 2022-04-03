package com.ds;

public class reversestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("Ramya"));
		System.out.println("ramya".equals("ramya"));

	}
	
	public static String reverse(String str)
    {
        // TODO
		if(str.length() == 1)
		{
			return str;
		}
		else
		{
			return String.valueOf(str.charAt(str.length()-1))+reverse(str.substring(0, str.length()-1));
		}
    }
	
	

}
