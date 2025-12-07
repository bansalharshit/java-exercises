package com.harshit.strings;

import java.util.Arrays;

public class PalindromeCheck {
	
	public static boolean palindromeCheck(String s)
	{
		 int start = 0, end = s.length() -1;
		 if(s.length()==0)
		 {
			 System.out.println("String is empty");
			 return false;
		 }
		 while(start<end)
		 {
			 if(s.charAt(start++) == s.charAt(end--))
				 return true;
		 }
		 return false;
	}
	
public static void main(String[] args)
{
	System.out.println(palindromeCheck("HeleH"));
	
}
}
