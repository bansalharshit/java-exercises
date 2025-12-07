package com.harshit.strings;

public class RemoveWhiteSpace {
public static void main(String[] args) {
	String str = "Harshit Bansal";
	StringBuilder sb = new StringBuilder();
	for(char ch:str.toCharArray())
	{
		if(ch!=' ')
		{
			sb.append(ch);
		}
	}
	System.out.println(sb.toString());
}
}
