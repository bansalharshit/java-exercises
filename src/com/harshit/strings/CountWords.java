package com.harshit.strings;

public class CountWords {
public static void main(String[] args) {
	String str = "Harshit Bansal";
	boolean isWord = false;
	int count = 0;
	for(char ch: str.toCharArray())
	{
		if(ch!=' ')
		{
			if(!isWord)
				count++;
			isWord = true;
		}else {
			isWord = false;
		}
			
	}
	System.out.println(count);
}
}
