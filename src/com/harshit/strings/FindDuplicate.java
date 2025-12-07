package com.harshit.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicate {
public static void main(String[] args) {
	String str = "Harshit Bansal";
	char[] chrs = str.toCharArray();
	Map<Character, Integer> freq = new HashMap<>();
	for(char c:chrs)
	{
		freq.put(c, freq.getOrDefault(c, 0)+1);
	}
	
	for(Entry<Character, Integer> it:freq.entrySet())
	{
		if(it.getValue()>1)
		{
			System.out.println("["+it.getKey()+", "+it.getValue()+" ]");
		}
	}
}
}
