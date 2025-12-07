package com.harshit.strings;

import java.util.Arrays;

public class CheckAnagram {
	// one way
public static void main(String[] args) {
	String s1 = "Harshit";
	String s2 = "tihsrah2";
	String mS1 = s1.toLowerCase();
	String mS2 = s2.toLowerCase();
	if(mS1.length()!=mS2.length())
		System.out.println("not anagram strings");
	char[] char1 = mS1.toCharArray();
	char[] char2 = mS2.toCharArray();
	Arrays.sort(char1);
	Arrays.sort(char2);
	boolean flag = Arrays.equals(char1, char2);
	if(flag)
		System.out.println("Anagram");
	else
		System.out.println("Not Anagram");
}

// another way using hashmap
}

