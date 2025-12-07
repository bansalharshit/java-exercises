package com.harshit.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	public static Character firstNonRepeatingChar(String s)
	{
		Map<Character, Integer> nonRepeat = new HashMap<>();
		for(char ch:s.toCharArray())
			nonRepeat.put(ch, nonRepeat.getOrDefault(ch, 0)+1);
		
		for(char ch:s.toCharArray())
		{
			if(nonRepeat.get(ch) == 1)
				return ch;
		}
		return null;
	}
public static void main(String[] args) {
	String s = "harshit bansal";
	char ch = firstNonRepeatingChar(s);
	System.out.println(ch);
}
}
