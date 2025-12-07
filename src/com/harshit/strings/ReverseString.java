package com.harshit.strings;

import java.util.Arrays;

public class ReverseString {
	
	public static String reverseString(String s)
	{
		char[] chars = s.toCharArray();
		int start = 0, end = chars.length-1;
		while(start<end)
		{
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
		return new String(chars);
	}
	
public static void main(String[] args)
{
	System.out.println(reverseString("Hello"));
	String str = "Harshit Bansal";
    StringBuilder sb = new StringBuilder(str);
    StringBuilder newStr = sb.reverse();
    System.out.println(newStr.toString());
}
}
