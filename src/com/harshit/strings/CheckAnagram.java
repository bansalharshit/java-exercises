package com.harshit.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CheckAnagram {
	// one way
//public static void main(String[] args) {
//	String s1 = "Harshit";
//	String s2 = "tihsrah2";
//	String mS1 = s1.toLowerCase();
//	String mS2 = s2.toLowerCase();
//	if(mS1.length()!=mS2.length())
//		System.out.println("not anagram strings");
//	char[] char1 = mS1.toCharArray();
//	char[] char2 = mS2.toCharArray();
//	Arrays.sort(char1);
//	Arrays.sort(char2);
//	boolean flag = Arrays.equals(char1, char2);
//	if(flag)
//		System.out.println("Anagram");
//	else
//		System.out.println("Not Anagram");
//}

// another way using hashmap
	public static void main(String[] args) {
		String s1 = "Harshit";
		String s2 = "tihsrah";
		if(checkAnagram(s1.toLowerCase(),s2.toLowerCase()))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		
	}

	private static boolean checkAnagram(String s1,String s2) {
		Map<Character, Integer> charCount = new HashMap<>();
		// for first string
		for(char ch:s1.toCharArray())
		{
			charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
		}
		// for Second String
		for(char ch:s2.toCharArray())
		{
			charCount.put(ch, charCount.getOrDefault(ch, 0)-1);
		}
		
		for(var it:charCount.entrySet())
		{
			if(it.getValue()!=0)
				return false;
		}
		return true;
	}
}

